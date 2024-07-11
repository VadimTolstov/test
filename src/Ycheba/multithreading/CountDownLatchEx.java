package Ycheba.multithreading;

import java.util.concurrent.CountDownLatch;
/* CountDownLatch - синхронизатор замок с обратным отчетом, потоки ждут столько сколько операций указано в CountDownLatch
.countDown() - уменьшает значения CountDownLatch на единицу
.getCount() - получаем значения счетчика countDownLatch
.await();// если счетчик CountDownLatch больше нуля то поток будет заблокирован если меньше то поток продолжит работу
 */
public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Персонал маркета готов к работе");
        countDownLatch.countDown();// уменьшает значения CountDownLatch на единицу
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("Все готово, пора открывать маркет");
        countDownLatch.countDown();// уменьшает значения CountDownLatch на единицу
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException{
        Thread.sleep(4000);
        System.out.println("Маркет открыт !!!");
        countDownLatch.countDown();// уменьшает значения CountDownLatch на единицу
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
    public static void main(String[] args) throws InterruptedException {
        new Friend("Заур", countDownLatch);
        new Friend("Олег", countDownLatch);
        new Friend("Елена", countDownLatch);
        new Friend("Виктор", countDownLatch);
        new Friend("Марина", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();// если счетчик CountDownLatch больше нуля то поток будет заблокирован если меньше то поток продолжит работу
            System.out.println(name + " приступил(а) к закупкам");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
