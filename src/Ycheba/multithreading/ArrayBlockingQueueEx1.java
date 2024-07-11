package Ycheba.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

/*ArrayBlockingQueue - потокобезопасная очередь с ограниченным размером (capacity restricted).
Обычно один или несколько потоков добавляют элементы в конец очереди, а другой или другие потоки забирают элементы из
начала очереди.
 */
public class ArrayBlockingQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);//создаем
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5);//не добавиться т.к размер 4 при использовании add выбросит эксепшен
        System.out.println(queue);
    }
}
