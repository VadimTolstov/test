package Ycheba.multithreading;

/*
.getName() - возвращает имя потока
.getPriority() - возвращает приоритет потока
.getPriority() - возвращает приоритет потока
.getPriority() - возвращает приоритет потока
.setName("my_potok") - устанавливает имя потока
.setPriority(2) - устанавливает приоритет потока от 1-10 не гарантирует выполнение приоритета
Стандартные настройки потока для читабильности кода
 myThread5.setPriority(Thread.MIN_PRIORITY); - 1
 myThread5.setPriority(Thread.MAX_PRIORITY); - 10
 myThread5.setPriority(Thread.NORM_PRIORITY); - 5
 */
public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("my_potok");
        myThread5.setPriority(2);
        myThread5.setPriority(Thread.MIN_PRIORITY);
        myThread5.setPriority(Thread.MAX_PRIORITY);
        myThread5.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Name of myThread5 = " + myThread5.getName() +
                           " Priority of myThread5 = " + myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        System.out.println("Name of myThread6 = " + myThread6.getName() +
                           " Priority of myThread6 = " + myThread6.getPriority());
    }
}

class MyThread5 extends Thread{
    public void run(){
        System.out.println("privet");
    }
}
