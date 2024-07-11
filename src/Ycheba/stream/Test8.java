package Ycheba.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
.collect(Collectors.groupingBy(el -> el.getCourse())) групирует студентов в новый лист и ключем станет их курс Map<Integer, List<Student>>
 можно делать ключь и стринг и что угодно похоже
.collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));//partitioningBy - делит на две группы и принемает булион el.getAvgGrade() >7   Map<Boolean, List<Student>>
 */
public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 'м', 22, 3, 8.3);
        Student st2 = new Student("Виктор", 'м', 28, 2, 6.4);
        Student st3 = new Student("Анна", 'ж', 19, 1, 8.9);
        Student st4 = new Student("Лера", 'ж', 35, 4, 7);
        Student st5 = new Student("Таня", 'ж', 23, 3, 9.1);
        List<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Map<Integer, List<Student>> map = students.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .collect(Collectors.groupingBy(el -> el.getCourse()));//группируем по курсу
        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        Map<Boolean, List<Student>> map2 = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));//делем на группы partitioningBy принемает булион el.getAvgGrade() >7

        for (Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
