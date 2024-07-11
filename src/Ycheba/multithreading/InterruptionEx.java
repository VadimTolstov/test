package Ycheba.multithreading;

/*
thread.interrupt() - поток main посылает потоку thread что его хотят прервать в данном примере
isInterrupted() - с помощь этого метода поток проверяет хотят ли его прервать или нет

если поток прервать когда он спит появится ошибка
 */
public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();// поток main посылает потоку thread, что его хотят прервать

        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 1; i <= 1000000000; i++) {
            if (isInterrupted()){//здесь поток проверяет не хотят ли его завершить
                System.out.println("Поток хотят прервать ");
                System.out.println("Мы убедились, что состояние всех объектов нормальное и решили завершить работу потока");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);

            //если поток пытаться прервать когда он спит то вылелит ошибка InterruptedException
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток спит но его пытаются прервать!!!!!");
                System.out.println(sqrtSum);
                e.printStackTrace();
                return;
            }
        }
        System.out.println(sqrtSum);
    }

}
