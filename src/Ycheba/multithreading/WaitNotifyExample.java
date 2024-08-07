package Ycheba.multithreading;

/*
//synchronized идет по объекту this
wait() - усыпляет поток захвативший монитор и освобождает монитор
notify() - не освобождает монитор, а пробуждает поток усыпленный через wait()
 wait(1000) - может принимать милисикунды и после этого времени станет активным
 while - используем т.к поток может сам проснутся по этому не используют if
 */
public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}

class Market {
 // private static final  Object lock = new Object();//это отдельный пример написания с замком дальше все без замка кроме метода getBread2()
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("------------------Потребитель купил 1 хлеб ");
        System.out.println("Количество хлеба в магазине = " + breadCount);
        notify();
    }

    //пример с замком где явно показано что wait() и  notify() вызывается на this  - lock.wait()  lock.notify();
//    public void getBread2() {
//        synchronized (lock) {
//            while (breadCount < 1) {
//                try {
//                    lock.wait();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//        breadCount--;
//        System.out.println("Потребитель купил 1 хлеб ");
//        System.out.println("Количество хлеба в магазине = " + breadCount);
//        lock.notify();
//    }


    public synchronized void putBread() { //synchronized идет по объекту this
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Производитель добавил на витрину 1 хлеб");
        System.out.println("Количество хлеба в магазине = " + breadCount);
        notify();
    }
}

class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}