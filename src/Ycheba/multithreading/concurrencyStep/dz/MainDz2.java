package Ycheba.multithreading.concurrencyStep.dz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainDz2 {


    public static void main(String[] args) {
        final int SIZE = 1_000_000;
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch = new CountDownLatch(3);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 0; i < SIZE; i += 2) {
                    sum += i;
                }
                System.out.println("Сумма четных чисел = " + sum);
                countDownLatch.countDown();
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 0; i < SIZE; i++) {
                    if (i % 7 == 0) {
                        sum += i;
                    }
                }
                System.out.println("Сумма чисел кратных 7 = " + sum);
                countDownLatch.countDown();
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                List<Integer> list = new ArrayList<>();
                long size = 0;
                for (int i = 0; i < 1000; i++) {
                    list.add(new Random().nextInt(0, 1000));
                }
                for (int array : list) {
                    if (array % 2 == 0) {
                        size++;
                    }
                }
                System.out.println("Колличество четных чисел в массиве = " + size);
                countDownLatch.countDown();
            }
        });

        executorService.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}