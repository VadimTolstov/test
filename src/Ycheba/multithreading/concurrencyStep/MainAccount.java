package Ycheba.multithreading.concurrencyStep;

public class MainAccount {
    public static void main(String[] args) {

        Account account = new Account(1000, 1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                account.transferFrom1To2(300);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                account.transferFrom2To1(500);
            }
        }).start();
    }
}
