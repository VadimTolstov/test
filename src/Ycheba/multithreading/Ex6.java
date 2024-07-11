package Ycheba.multithreading;
/*
если запускать поток не через start а через run то поток не запустится
 */
public class Ex6 implements Runnable {

    @Override
    public void run() {
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());// Вернет имя тякущего потока
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        thread.start();
        thread.run();
        System.out.println("Method main.  Thread name = " +
                           Thread.currentThread().getName());
    }
}
