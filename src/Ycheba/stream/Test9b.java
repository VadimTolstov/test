package Ycheba.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
.mapToInt() - вернет инт стрим у него есть еще методы sum vin average max
.boxed() - конвектирует в данном случаи int в Integer
.average()
.min()
.max()
.sum()
 */
public class Test9b {
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

        List<Integer> courses = students.stream()
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses);
        System.out.println("---------------------------------");

        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);
        System.out.println("------------------------------------");

        double average = students.stream()
                .mapToInt(el -> el.getCourse())
                .average()
                .getAsDouble();
        System.out.println(average);
        System.out.println("------------------------------------");

        int min = students.stream()
                .mapToInt(el -> el.getCourse())
                .min()
                .getAsInt();
        System.out.println(min);
        System.out.println("------------------------------------");

        int max = students.stream()
                .mapToInt(el -> el.getCourse())
                .max()
                .getAsInt();
        System.out.println(max);
    }
}