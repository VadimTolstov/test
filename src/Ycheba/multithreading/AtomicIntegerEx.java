package Ycheba.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/* AtomicInteger - это класс, который предоставляет возможность работать с целочисленным значением int,
используя атомарные операции.
Есть и другие классы Atomic работают похоже AtomicBoolean, AtomicLong, AtomicIntegerArray и тд
.incrementAndGet() - увеличь и дай.
.getAndIncrement() - дай и увеличь
.addAndGet(5) - увеличь на 5 и верни или поставь -5 и уменьшит
.getAndAdd(5) - дай число потом увеличь на 5
.decrementAndGet() - уменьши на единицу и верни
.getAndDecrement() - дай и верни
 */
public class AtomicIntegerEx {

    static int counter = 0;
    static int counter1 = 0;

    static AtomicInteger counter2 = new AtomicInteger(0);
    static AtomicInteger counter3 = new AtomicInteger(0);

    public synchronized static void increment() {//c synchronized
        counter++;
    }

    public static void increment1() {//без synchronized метода
        counter1++;
    }

    public static void increment2() {// c AtomicInteger
        counter2.incrementAndGet();
    }

    public static void increment3() {// c AtomicInteger
        counter3.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl18());
        Thread thread2 = new Thread(new MyRunnableImpl18());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("counter с synchronized = " + counter);
        System.out.println("counter1 без synchronized = " + counter1);
        System.out.println("counter2 с AtomicIntegerEx = " + counter2);
        System.out.println("counter3 с counter3.addAndGet(5); = " + counter3);
    }
}

class MyRunnableImpl18 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            AtomicIntegerEx.increment();
            AtomicIntegerEx.increment1();
            AtomicIntegerEx.increment2();
            AtomicIntegerEx.increment3();
        }
    }
}
