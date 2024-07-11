package Ycheba.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
Thread poll - это множество потоков, каждый из которых предназначен для выполнения той или иной задачи.
В Java c thread pool-ами удобнее всего работать посредством ExecutorService.
Thread poll удобнее всего создавать, используя factory
методы класса Executors:
Executors.newFixedThreadPool(int count) - создает poll с count - количеством потоками;
Executors.newSingleThreadExecutor() - создает poll с одним потоком;

.execute(new RunnableImpl100()) - передает наши задания в потоки, передав в метод execute объект new RunnableImpl100() имплементирующий Runnable
.shutdown() - заканчивает работу ExecutorService иначе он будет ждать до бесконечности новые задачи
.awaitTermination(5, TimeUnit.SECONDS) - (вызывается после .shutdown()) принуждает поток в котором он вызвался подождать
(в данном примере это main) до тех пор, пока не выполнится одно из двух событий: либо  ExecutorService прекратит свою работу,
либо пройдет время, указанное в параметре метода awaitTermination.
 */
public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);//создает poll с 5-ю потоками;
        for (int i = 0; i < 10; i++){
            executorService.execute(new RunnableImpl100());// запускаем потоки
        }
        executorService.shutdown();//заканчивает работу ExecutorService иначе он будет ждать до бесконечности новые задачи
        executorService.awaitTermination(5, TimeUnit.SECONDS);//заставляем main ждать пока не пройдет время или не перестанет работать ExecutorService
        System.out.println("Main ends");

        ExecutorService executorService2 = Executors.newSingleThreadExecutor();// вот так создается один поток
    }
}

class RunnableImpl100 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}