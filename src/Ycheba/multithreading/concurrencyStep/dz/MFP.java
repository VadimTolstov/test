package Ycheba.multithreading.concurrencyStep.dz;

public class MFP {

    private final Object LOCKE1 = new Object();
    private final Object LOCKE2 = new Object();

    public void scan(int quantity) {
        synchronized (LOCKE1) {
            try {
                for (int i = 1; i <= quantity; i++) {
                    Thread.sleep(1000);
                    System.out.println("Отпечатано " + i + "стр");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void print(int quantity) {
        synchronized (LOCKE2) {
            try {
                for (int i = 1; i <= quantity; i++) {
                    Thread.sleep(1000);
                    System.out.println("Отсканировано " + i + "стр");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
