package Ycheba.Collekcii.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

/*
priorityQueue.peek() выводит наименьший элемент //1 4 7 8 10 выведет 1
удаляет по этому же приоритету // 1,4,7,8,10
 */
public class PriorityQueueUx2 {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur",5);
        Student st2 = new Student("Mariya",1);
        Student st3 = new Student("Sergey",2);
        Student st4 = new Student("Igor",3);
        Student st5 = new Student("Vasiliy",4);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", course=" + course +
               '}';
    }
    //если сравнение compareTo идет только по course значит и в equals и  hashCode должен быть только course
    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
