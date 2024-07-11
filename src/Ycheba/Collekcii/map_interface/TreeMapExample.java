package Ycheba.Collekcii.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

//Незабываем implements Comparable<T> для класса который будет ключем или TreeMap не сможет фильтровать

//put, get, remove аналогичны HasMap
//.descendingMap() выводит ключи по убыванию
//.headMap(7.3) вывидит значения ключа ниже 7.3
//.lastEntry() вывидит значение в конце листа (последнее)
//.firstEntry() вывидит значения в начале листа
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
        treeMap.put(5.8, st1);
        treeMap.put(9.1, st7);
        treeMap.put(6.4, st2);
        treeMap.put(7.5, st4);
        treeMap.put(7.2, st3);
        treeMap.put(8.2, st6);
        treeMap.put(7.9, st5);

        System.out.println(treeMap);
        System.out.println(treeMap.get(6.4));
        treeMap.remove(5.8);
        System.out.println(treeMap);
        System.out.println("descendingMap() " + treeMap.descendingMap());//-----------------------------
        System.out.println("headMap() " + treeMap.headMap(7.3));//-----------------------------
        System.out.println("lastEntry() " + treeMap.lastEntry());//-----------------------------
        System.out.println("firstEntry() " + treeMap.firstEntry());//-----------------------------



    //если Comparable не определяем в классе Student то делаем как ниже прям в TreeMap<>(new Comparator<Student>()
        TreeMap<Student, Double> treeMap2 = new TreeMap<>();
        TreeMap<Student, Double> treeMap3 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        Student st11 = new Student("Zaur", "Tregulov", 3);
        Student st22 = new Student("Mariya", "Ivanova", 1);
        Student st33 = new Student("Sergey", "Petrov", 4);
        Student st44 = new Student("Igor", "Sidorov", 2);
        Student st55 = new Student("Vasiliy", "Smirnov", 1);
        Student st66 = new Student("Sasha", "Kapustin", 3);
        Student st77 = new Student("Elena", "Sidorova", 4);
        treeMap2.put( st11,5.8);
        treeMap2.put( st77,9.1);
        treeMap2.put( st22,6.4);
        treeMap2.put( st44,7.5);
        treeMap2.put( st33,7.2);
        treeMap2.put( st66,8.2);
        treeMap2.put( st55,7.9);

        System.out.println(treeMap2);
        System.out.println("get " + treeMap.get(6.4));
//        treeMap.remove(5.8);
//        System.out.println(treeMap);
//        System.out.println("descendingMap() " + treeMap.descendingMap());//-----------------------------
//        System.out.println("headMap() " + treeMap.headMap(7.3));//-----------------------------
//        System.out.println("lastEntry() " + treeMap.lastEntry());//-----------------------------
//        System.out.println("firstEntry() " + treeMap.firstEntry());//-----------------------------
    }
}
