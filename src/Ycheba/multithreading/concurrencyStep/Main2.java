package Ycheba.multithreading.concurrencyStep;

public class Main2 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        long start = System.currentTimeMillis();
        int barrier = 10_000_000;
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.inc();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.dec();
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
        System.out.println(counter.getValue());
        long after = System.currentTimeMillis();
        System.out.println(after - start);
    }
}