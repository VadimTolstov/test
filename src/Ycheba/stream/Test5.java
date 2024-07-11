package Ycheba.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
.sorted((x, y) -> x.getName().compareTo(y.getName())) сортирует
но нужно не забывать добавлять метод для сортировки класса

Stream.concat(stream3,stream2); concat- объединяют 2 стрима в один статический метод нельзя использовать в цепочке
 */
public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

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

        students = students.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(students);

        int[] array2 = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        int asInt = Arrays.stream(array2).filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                }).reduce((a, e) -> a + e).getAsInt();
        System.out.println(asInt);

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream3 = Stream.of(7,8,9,10,11);
        Stream<Integer> stream4 = Stream.concat(stream3,stream2);
        stream4.forEach(System.out::println);
    }
}