package Ycheba.multithreading.concurrencyStep;

import java.util.Arrays;

public class Main {

    private static final int SIZE = 50_000_000;
    private static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        startTimer();
        new Thread(new Runnable() {
            @Override
            public void run() {
                withConcurrency();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                withoutConcurrency();
            }
        }).start();
    }

    private static void startTimer() {
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int seconds = 0;
                try {
                    while (true) {
                        System.out.println(seconds++);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        timer.setDaemon(true);
        timer.start();
    }

    private static void withConcurrency() {
        float[] array = new float[SIZE];
        Arrays.fill(array, 1.0f);
        long start = System.currentTimeMillis();
        float[] array2 = new float[HALF];
        float[] array3 = new float[HALF];
        System.arraycopy(array, HALF, array2, 0, HALF);
        System.arraycopy(array, 0, array3, 0, HALF);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array2.length; i++) {
                    float f = (float) (i + HALF);
                    array2[i] = (float) (array2[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array3.length; i++) {
                    float f = (float) i;
                    array3[i] = (float) (array3[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.arraycopy(array3, 0, array, 0, HALF);
        System.arraycopy(array2, 0, array, HALF, HALF);
        long finish = System.currentTimeMillis();
        System.out.println("Многопоточный поток " + (finish - start));
    }

    private static void withoutConcurrency() {
        float[] array = new float[SIZE];
        Arrays.fill(array, 1.0f);
        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            float f = (float) i;
            array[i] = (float) (array[i] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
        }
        long finish = System.currentTimeMillis();
        System.out.println("Обычный поток " + (finish - start));
    }
}