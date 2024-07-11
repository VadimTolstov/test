package Ycheba.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Предыдущия информация в классе LockExample
tryLock() - метод залочит монитор если тот свободен, если монитор занят то метод пойдет дальше выполнять код, пропустив
синхронизированный участок кода, возвращает булион
 */
public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Заур", lock);
        new Employee("Олег", lock);
        new Employee("Елена", lock);
        Thread.sleep(5000);
        new Employee("Виктор", lock);
        new Employee("Мария", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    //вариант с lock не пропуская код если монитор занят
    public void run2() {
        try {
            System.out.println(name + " ждет..... ");
            lock.lock();
            System.out.println(name + " пользуется банкоматом");
            Thread.sleep(200);
            System.out.println(name + " завершил(а) свои дела");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Вылетела ошибка в try");
        } finally {
            lock.unlock();
        }
    }

    //вариант с tryLock пропускает код если монитор занят
    public void run() {
        if (lock.tryLock()) {
            try {
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(200);
                System.out.println(name + " завершил(а) свои дела");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Вылетела ошибка в try");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}