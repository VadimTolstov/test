package Ycheba.multithreading.concurrencyStep;

import java.util.Arrays;

public class MyRunnable implements Runnable {
    public void withConcurrency() {
        float[] array = new float[10_000_000];
        Arrays.fill(array, 1.0f);
        float[] array2 = new float[5_000_000];
        float[] array3 = new float[5_000_000];
        System.arraycopy(array, 5_000_000, array2, 0,5_000_000);
        System.arraycopy(array, 0, array3, 0,5_000_000);
        for (int i = 0; i < array.length; i++) {
            array2[i] = (float) (array2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            array3[i] = (float) (array3[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.arraycopy(array3, 0, array, 0,5_000_000);
        System.arraycopy(array2, 0, array, 5_000_000,5_000_000);
    }

    public void withhoutCouncurrency() {
        float[] array = new float[10000000];
        Arrays.fill(array, 1.0f);
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    @Override
    public void run() {

    }
}
