package Ycheba.Collekcii.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

/*
разница offer написана в LinkedListEx
deque.addFirst(3); добавил в начало
deque.offerFirst(1); добавил в начало
deque.addLast(7); добавили в конец
deque.offerLast(8); добавили в конец
deque.removeFirst();   deque.pollFirst(); удаляем первый элемент в очереди
deque.removeLast();    deque.pollLast();  удаляем последний элемент в очереди
deque.getFirst()); deque.peekFirst()); вывести первый элемент
deque.getLast()); deque.peekLast()); вывести последний элемент
 */
public class ArrayDequeEx {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        System.out.println(deque);
        System.out.println("getFirst " + deque.getFirst());
        System.out.println("getLast " + deque.getLast());
        System.out.println("peekFirst " + deque.peekFirst());
        System.out.println("peekLast " + deque.peekLast());

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
    }
}
