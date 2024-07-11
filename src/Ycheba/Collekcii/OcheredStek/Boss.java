package Ycheba.Collekcii.OcheredStek;

import java.util.Queue;

// (FIFO).

public class Boss {
    private Queue toDoQueue;// у босса тоже есть ссылка на очередь из заданий
    public Boss(Queue toDoQueue) {
        this.toDoQueue = toDoQueue;// даем ссылку на очередь в конструкторе
    }
    public void giveTask(String task) {
        toDoQueue.add(task); // кладем задание в очередь
        System.out.println("Дал задачу " + task);
    }
}
//В Java существует паттерн проектирования под названием Producer-Consumer, который отлично подойдет
// в качестве примера использования очереди.
//Итак, представьте, что у нас есть один начальник, у которого в подчинении один рабочий.
// Наш начальник приходит утром на работу и дает несколько заданий работнику, а рабочий затем
// их выполняет одно за другим. Давайте представим эту абстракцию классами Java и напишем простую программу
// для демонстрации работы Queue.