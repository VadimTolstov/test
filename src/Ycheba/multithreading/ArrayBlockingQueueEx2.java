package Ycheba.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

/*ArrayBlockingQueue - потокобезопасная очередь с ограниченным размером (capacity restricted).
Обычно один или несколько потоков добавляют элементы в конец очереди, а другой или другие потоки забирают элементы из
начала очереди.

.put(++i)- добавляет элемент в конец очереди
.take() - забирает первый элемент из очереди
 */
public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);//создаем

        //Producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Продюсер добавил число " + i + " очередь: " + arrayBlockingQueue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        //Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Консюмер забрал элемент " + j + " очередь: " + arrayBlockingQueue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
