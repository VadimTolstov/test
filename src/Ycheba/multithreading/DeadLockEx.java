package Ycheba.multithreading;

/*
DeadLock - ситуация, когда 2 или более потоков залочены навсегда, ожидают друг друга и ничего не делают.
что бы избежать DeadLock надо что бы lock были в одинаковом порядках в разных методах
( к примеру  synchronized (DeadLockEx.lock1) потом synchronized (DeadLockEx.lock2) и так в обоих методах классов Thread10 и Thread20)

ЕСТЬ ЕЩЕ
Livelock - ситуация, когда 2 или более потоков залочены навсегда, ожидают дргу друга, проделывают какую-то работу, но
без какого-либо прогресса.

Lock starvation - ситуация, когда менее приоритетные потоки ждут долгое время или все время для того, чтобы могли запуститься.
 */
public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread20.start();
        thread10.start();
    }

}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: Попытка захватить монитор объекта lock1 ");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: Монитор объекта lock1 захвачен");
            System.out.println("Thread10: Попытка захватить монитор объекта lock2 ");
            synchronized (DeadLockEx.lock2) { // разный порядок (DeadLockEx.lock2) в Thread20 и Thread10
                System.out.println("Thread10: Мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: Попытка захватить монитор объекта lock2 ");
        synchronized (DeadLockEx.lock2) { // разный порядок (DeadLockEx.lock2) в Thread20 и Thread10 надо поменять местами с
            System.out.println("Thread20: Монитор объекта lock2 захвачен");
            System.out.println("Thread20: Попытка захватить монитор объекта lock1 ");
            synchronized (DeadLockEx.lock1) { // поменять местами с (DeadLockEx.lock2)
                System.out.println("Thread20: Мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}