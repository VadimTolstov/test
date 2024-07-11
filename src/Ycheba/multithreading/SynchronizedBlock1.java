package Ycheba.multithreading;

/*
СИНХРОННЫЙ БЛОК
у объекта или класса есть монитор спомощью которого достигается синхронизация. Когда какойто класс или объект обозначенный
 использует поток то монитор становится занят не давая другому потоку использовать класс или объект пока первый поток
 не перестанет работать с данным классом или объектом
   synchronized () - отличия блока от метода в том что мы можем синхронизировать не весь метод
 */
public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableImpl2 runnable = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Counter2 {
    static int count = 0;

}

class MyRunnableImpl2 implements Runnable {

    private void doWork1(){
        System.out.println("Это не синхронизировано!!! ");
    }

    public void increment() {
        doWork1();
        //синхронизированный блок
        synchronized (this)  //в скобках (this) объект или название класса на котором мы будем синхронизироваться монитор который мы будем использовать
        //код который мы хотим быть синхронизирован внутри скобок
        {
            Counter2.count++;
            System.out.println(Counter2.count + " ");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}

