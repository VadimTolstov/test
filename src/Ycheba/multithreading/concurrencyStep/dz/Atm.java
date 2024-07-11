package Ycheba.multithreading.concurrencyStep.dz;

public class Atm {
    private final Object lock = new Object();
    private double moneys;

    public Atm(double moneys) {
        this.moneys = moneys;
    }

    public void withdrawMoney(String name, double money) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println(name + " подошел к банкомату");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (moneys >= money) {
                        moneys -= money;
                        System.out.println(name + " вывел " + money + "  рублей ");
                        System.out.println("В банкомате осталась " + moneys + " рублей");
                    } else {
                        System.out.println("В банкомате недостаточно денег для " + name + ".");
                    }
                }
            }
        });
        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
