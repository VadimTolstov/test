package Ycheba.multithreading.concurrencyStep;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main7 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long millis = (long) (Math.random() * 5000 + 1000);
                    String name = Thread.currentThread().getName();
                    System.out.println(name + ": Данные начали подготовку");
                    try {
                        Thread.sleep(millis);
                        System.out.println(name + ": Данные готовы");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException | BrokenBarrierException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(name + ": Закончил работу");
                }
            }).start();
        }
    }

    private static void workWithFileSystem() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " поток начел работу с файловой системой");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " поток закончил работу с файловой системой");
    }
}
