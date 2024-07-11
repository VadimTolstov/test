package Ycheba.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
ScheduledExecutorService мы используем тогда, когда хотим установить расписание на запуск потоков из пула.
Данный pool создается, используя factory метод класса
Executors:
Executors.newScheduledThreadPool(int count)

.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS); - метод выполнит наше задание (new RunnableImpl200()) через 3 секунды (TimeUnit.SECONDS)
.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS); - метод планирует задачу для периодического выполнения
впервые это задача обработается через 3 секунды после запуска метода и потом будет выполняться с периодичностью в 1 секунду
(1 секунда между началом первой и началом второй задачи, если задача длилась более 1 секунды то поток после окончания 1ой задачи
не ждет и начинает приступать ко второй задаче, если задача длилась 0,5 секунды то поток подождет еще 0,5 секунды и начнет выполнять новое задание)
.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS) - аналогично .scheduleAtFixedRate но 1 секунда здесь
означает, что после окончания задачи поток подождет 1 секунду перед началом новой задачи.
 */
public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++){
//            scheduledExecutorService.execute(new RunnableImpl200());
//        }
//        scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS); // выполни это задание через 3 секунды
//        scheduledExecutorService.shutdown();

        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);//задача обработается через 3 сек и потом будет обрабатываться через 1 секунду
//        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);//задача обработается через 3 сек и потом будет ждать  1 секунду после окончания задачи

        Thread.sleep(20000);//усыпляем main что бы scheduleAtFixedRate сработал больше 1го раза
        scheduledExecutorService.shutdown();// и после сна main потока завершаем scheduleAtFixedRate

        ExecutorService executorService = Executors.newCachedThreadPool();// кэшированный Thread pool создает потоки по мере
        //необходимости, если потом потокам нет заданий он удаляет через некоторое время лишние потоки
    }

}

class RunnableImpl200 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}