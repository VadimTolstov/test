package Ycheba.multithreading;

/*
volatile позволяет хранить переменную в основной памяти main (main memory) и когда мы ее меняем она передается в CPU 1 и 2 потока
volatile - если не использовать то переменная будет хранится в кэше CPU 1 и 2 и не известно когда она изменится
volatile - работает корректно когда только один поток ее изменяет, а остальные читают
 */
public class VolatileEx extends Thread {
    volatile boolean b = true; // обозначили переменную

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished. counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!");
        thread.b = false; // меняем переменную в потоке
        thread.join();
        System.out.println("End of programm");
    }
}
