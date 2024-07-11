package Ycheba.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
Lock - интерфейс, который имплементируется классом ReentrantLock.
lock() - активирует наш лок и после который идет код может использоваться только один поток
unlock() - надо всегда писать в блоке finally что бы он в случаи ошибки смог всегда снять блокировку

Продолжение в классе Bankomat
 */
public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsappCall();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();//ставим замок на монитор и дальше выполняется код
        try {
            System.out.println("Начался мобильный звонок");
            Thread.sleep(3000);
            System.out.println("Закончился мобильный звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
                    }
        finally {
            lock.unlock();//снимаем замок с монитора
        }
    }

    void skypeCall(){
        lock.lock();//ставим замок на монитор и дальше выполняется код
        try {
            System.out.println("Начался Skype звонок");
            Thread.sleep(5000);
            System.out.println("Закончился skype звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();//снимаем замок с монитора
        }
    }

    void whatsappCall(){
        lock.lock();//ставим замок на монитор и дальше выполняется код
        try {
            System.out.println("Начался whatsapp звонок");
            Thread.sleep(7000);
            System.out.println("Закончился whatsapp звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();//снимаем замок с монитора
        }
    }
}
