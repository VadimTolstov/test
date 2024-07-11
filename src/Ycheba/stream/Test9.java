package Ycheba.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
.min((x,y) -> x.getAge()-y.getAge()) - ищем мин значение в листе
.max((x,y) -> x.getAge()-y.getAge())- ищем мах значение в листе
 */
public class Test9 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Иван", 'м', 22, 3, 8.3);
        Student st2 = new Student("Виктор", 'м', 28, 2, 6.4);
        Student st3 = new Student("Анна", 'ж', 19, 1, 8.9);
        Student st4 = new Student("Лера", 'ж', 35, 4, 7);
        Student st5 = new Student("Таня", 'ж', 23, 3, 9.1);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Optional<Student> min = students.stream().min((x, y) -> x.getAge() - y.getAge());
        if (min.isPresent()) {
            System.out.println(min);
        } else {
            System.out.println("Что то не то");
        }

        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();

        System.out.println(max);
    }
}