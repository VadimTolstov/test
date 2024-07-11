package Ycheba.multithreading.concurrencyStep.dz;

import java.util.Map;
import java.util.concurrent.*;

public class MainDz4 {

    private static final int CARS_COUNT_IN_TUNNEL = 3;
    private static final Semaphore semaphore = new Semaphore(CARS_COUNT_IN_TUNNEL);
    private static final int CARS_COUNT = 10;
    private static final ExecutorService executorService = Executors.newCachedThreadPool();
    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(CARS_COUNT);
    private static final Map<Integer, Long> score = new ConcurrentHashMap<>();
    private static final CountDownLatch countDownLatch = new CountDownLatch(CARS_COUNT);
    private static final Object monitor = new Object();

    private static int winnerIndex = -1;

    public static void main(String[] args) {

        for (int i = 0; i < CARS_COUNT; i++) {
            final int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    prepare(index);
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException | BrokenBarrierException e) {
                        throw new RuntimeException(e);
                    }
                    long before = System.currentTimeMillis();
                    roadFirst(index);
                    tunnel(index);
                    roadSecond(index);
                    synchronized (monitor) {
                        if (winnerIndex == -1) {
                            winnerIndex = index;
                        }
                    }
                    long after = System.currentTimeMillis();
                    score.put(index, after - before);
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int key : score.keySet()) {
            System.out.println(key + ": " + score.get(key));
        }
        System.out.println("Winner: " + winnerIndex + " Time: " + score.get(winnerIndex));
        executorService.shutdown();
    }

    private static void sleepRandomTime() {
        try {
            Thread.sleep((long) (Math.random() * 5000 + 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void prepare(int index) {
        System.out.println(index + " начал подготовку");
        sleepRandomTime();
        System.out.println(index + " завершил подготовку");
    }

    private static void roadFirst(int index) {
        System.out.println(index + " начал по ровной дороге в начале");
        sleepRandomTime();
        System.out.println(index + " завершил по ровной дороге в начале");
    }

    private static void roadSecond(int index) {
        System.out.println(index + " начал по ровной дороге в конце");
        sleepRandomTime();
        System.out.println(index + " завершил по ровной дороге в конце");
    }

    private static void tunnel(int index) {
        try {
            semaphore.acquire();
            System.out.println(index + " начал ехать в тоннеле");
            sleepRandomTime();
            System.out.println(index + " завершил ехать в тоннеле");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }
}
