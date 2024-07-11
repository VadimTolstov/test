package Ycheba.multithreading;
/*
synchronized - синхронизует потоки если у метода указан этот модификатор то метод может исполняться потоками только
по очереди (1 начал 2 и 3 ждут пока 1 не закончит и тд) public static synchronized void increment() {counter++;}
Если метод static то используется монитор всего класса
 */
public class Ex11 {
    static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        Thread thread3 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(counter);
    }
}

class R implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex11.increment();
        }
    }
}