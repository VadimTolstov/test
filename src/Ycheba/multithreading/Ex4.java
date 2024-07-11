package Ycheba.multithreading;

/*
Создание потока через ананимный класс и лямда выражение
 */
public class Ex4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {//ананимные классы
            @Override
            public void run() {
                System.out.println("Privet");
            }
        }).start();

        new Thread(()-> System.out.println("Poka")).start();//лямда выражение
    }
}
