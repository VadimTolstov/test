package Ycheba.multithreading;

import java.util.concurrent.Semaphore;

/* Semaphore - это синхронизатор, позволяющий ограничить доступ к какому-то ресурсу. В конструктор Semaphore нужно передать
количество потоков, которыми Semaphore будет разрешать одновременно использовать этот ресурс.
.acquire() - предназначен для попытки получения разрешения Semaphore, заблокирует поток для других пока ресурс не будет доступен
.release() - освобождаем разрешение  Semaphore на единицу, пишем всегда в блоке finally
 */
public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Заур", callBox);
        new Person("Олег", callBox);
        new Person("Елена", callBox);
        new Person("Виктор", callBox);
        new Person("Марина", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " ждет ..... ");
            callBox.acquire();// предназначен для попытки получения разрешения Semaphore, заблокирует поток для других пока ресурс не будет доступен
            System.out.println(name + " пользуется телефоном ");
            Thread.sleep(2000);
            System.out.println(name + " завершил(а) звонок ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callBox.release();//освобождаем разрешение на Semaphore
        }
    }
}