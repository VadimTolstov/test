package Ycheba.multithreading;

/* СИНХРОНИЗАЦИЯ МЕТОДОВ ДЛЯ ПОТОКОв
Для синхронизации методов если нужна что бы разные потоки использовали методы по очереди а не все сразу можно использовать
статичный финальный класс -  static final Object lock = new Object(); сразу понятно для чего этот класс lock замок
и дальше по монитору этого класса синхронизируем  методы с блоками  synchronized (lock) { код }
Синхронизировать конструктор нельзя JVM гарантирует что конструктор может обрабатываться только одним потоком
 */
public class Ex12 {
   static final Object lock = new Object();//создаем пустой класс для синхронизации

    void mobileCall() {
        synchronized (lock) { /// -------------------синхронизируем по (car)
            System.out.println("Мобильный звонок начался");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Мобильный звонок закончился");
        }
    }

    void skypeCall() {
        synchronized (lock) {

            System.out.println("Скайп звонок начался");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Скайп звонок закончился");
        }
    }

    void whatsappCall() {
        synchronized (lock) {

            System.out.println("Ватсап звонок начался");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Ватсап звонок закончился");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsapp());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable {

    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {

    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImplWhatsapp implements Runnable {

    @Override
    public void run() {
        new Ex12().whatsappCall();
    }
}