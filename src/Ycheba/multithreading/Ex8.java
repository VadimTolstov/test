package Ycheba.multithreading;
/*
Thread.currentThread().getName() - вывидит имя потока у currentThread() есть разная информация об потоке
.join() - поток в котором вызывается join внутри потока (main в этом примере) и этот поток будет ждать пока не закончит
 свое действие поток на котором вызан  .join() ( в данном случаи на потоке thread1 ->thread1.join(); и thread2 ->thread2.join();)
 и только потом начет действовать main
 */
public class Ex8 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Ex8 thread2 = new Ex8();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Конец ");
    }
}

class MyRunnable1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}