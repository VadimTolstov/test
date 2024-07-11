package Ycheba.multithreading;

/*
  thread.join(1500); - здесь поток main подождале 1,5 секунды (если поставить больше то main подождет больше и когда закончит
  действовать поток thread продолжет свое действие) если поток thread не успеет доделать свои действия за 1,5сек то
  поток мейн продолжит свое действие и выведит System.out.println("Method main ends");
  thread.getState() - выводит состояние потока
 */
public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join(1500);
        System.out.println(thread.getState());
        System.out.println("Method main ends");
    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}
