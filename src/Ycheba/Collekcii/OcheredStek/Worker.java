package Ycheba.Collekcii.OcheredStek;

import java.util.Queue;

// (FIFO).

public class Worker {
    private Queue toDoQueue; // у рабочего есть ссылка на очередь из заданий
    public Worker(Queue toDoQueue) {
        this.toDoQueue = toDoQueue; // даем ссылку на очередь в конструкторе
    }
    public void takeTask() {
        Object task = toDoQueue.poll(); // вынимаем задание из очереди
        if (task != null) {
            System.out.println("Выполняю задачу: " + task);
        } else {
            System.out.println("Нет работы! Можно идти домой");
        }
    }

}

//Реализуйте пример выше с использованием стека вместо очереди, то есть теперь рабочий должен
// брать задачи в обратной последовательности, начиная с конца.
/*
import java.util.Deque; // импортируем Deque, так как у Queue нет методов для работы с концом коллекции

public class Worker {
   private Deque toDoDeque;
   public Worker(Deque toDoDeque) {
       this.toDoDeque = toDoDeque;
   }
   public void takeTask() {
       Object task = toDoDeque.pollLast(); // вынимаем задание из конца Deque
       if (task != null) {
           System.out.println("Выполняю задачу: " + task);
       } else {
           System.out.println("Нет работы! Можно идти домой");
       }
   }
}




 */
