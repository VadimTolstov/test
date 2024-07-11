package Ycheba.multithreading.stepMultithreading;

import java.util.Random;


public class Dz {
    public static long randomLong;
    public static boolean isCheslo = false;

    public static void main(String[] args) {
        int bound = 1_000_000_00;
        Random random = new Random();
        int number = random.nextInt(bound);
        System.out.println(number + " Вне трейда");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int option;
                do {
                    option = random.nextInt(bound);

                } while (option != number);
                System.out.println("option = " + option );
                isCheslo = true;
            }
        });
        thread.start();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!isCheslo) {
                    System.out.println(i++);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread1.start();
    }
}
