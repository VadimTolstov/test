package Ycheba.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
.findFirst(); -вернет первый элемент в листе
 */
public class Test8a {


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

        Optional<Student> first = students.stream().map(element -> {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(element -> element.getSex() == 'ж')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst();
        if (first.isPresent()) {
            System.out.println(first);
        } else {
            System.out.println("Not present");
        }

    }
}
