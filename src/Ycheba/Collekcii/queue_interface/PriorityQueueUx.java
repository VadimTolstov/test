package Ycheba.Collekcii.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

/*
priorityQueue.peek() выводит наименьший элемент //1 4 7 8 10 выведет 1
удаляет по этому же приоритету // 1,4,7,8,10
 */
public class PriorityQueueUx {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());


    }
}

