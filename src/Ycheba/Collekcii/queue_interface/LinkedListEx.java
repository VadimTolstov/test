package Ycheba.Collekcii.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

/*
queue.offer("Aleksandr") метод offer если лист был ограничен колличеством элементов то он не добавился если очередь переполнена
queue.remove() вернет первый удаленный элемент с листа если лист пуст вернет ЭКСЕПШЕН
queue.poll() вернет первый удаленный элемент с листа если лист пуст вернет null
queue.element() показывает какой элемент первый в очереди Выкидывает ЭКСЕПШЕН
queue.peek() показывает какой элемент первый в очереди если очередь пуста вернет null
 */
public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Mariya");
        queue.offer("Aleksandr");
        System.out.println(queue);
        System.out.println("remove " + queue.remove());
        System.out.println("element " + queue.element());
        System.out.println("peek " + queue.peek());
        System.out.println("poll " + queue.poll());
    }
}
