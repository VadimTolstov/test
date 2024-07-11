package Ycheba.multithreading.concurrencyStep.dz;

public class MainMFY {

    public static void main(String[] args) {
        MFP MFP = new MFP();
        new Thread(new Runnable() {
            @Override
            public void run() {
                MFP.print(3);
                MFP.scan(3);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                MFP.print(1);
                MFP.scan(3);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                MFP.print(1);
                MFP.scan(1);
            }
        }).start();
    }
}