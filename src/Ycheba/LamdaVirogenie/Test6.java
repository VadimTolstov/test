package Ycheba.LamdaVirogenie;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test6 {
}

class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo2 {
    void printStudent(Student2 st) {
        System.out.println("Imya studenta: " + st.name + ", pol: " + st.sex + ", vozrast: " + st.age + ", kurs: "
                           + st.course + ", srednyaya ocenka: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student2> aL, Predicate<Student2> t) {//интерфейс Predicate<T>{boolean test(T t)} содержит метод test
        for (Student2 s : aL) {
            if (t.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        Student2 st1 = new Student2("Иван", 'м', 22, 3, 8.3);
        Student2 st2 = new Student2("Виктор", 'м', 28, 2, 6.4);
        Student2 st3 = new Student2("Анна", 'ж', 19, 1, 8.9);
        Student2 st4 = new Student2("Лера", 'ж', 35, 4, 7);
        Student2 st5 = new Student2("Таня", 'ж', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo2 si = new StudentInfo2();
        System.out.println(" st.avgGrade > 8.5 -----------------------------------------------");
        si.testStudents(list, st -> st.avgGrade > 8.5);//лямда выражение и его можно использовать если с интерфейсе оди метод одно и тоже (Student st) -> {return st.avgGrade > 8.5;}
        System.out.println(" st.avgGrade > 9 -----------------------------------------------");
        si.testStudents(list, st -> st.avgGrade > 9);//можно не брать в скобки джава понимает что у интерфейса один метод boolean test(Student s) и он принимает в нем (Student s)
        System.out.println(" st.age < 29 && st.avgGrade < 7 -----------------------------------------------");
        si.testStudents(list, st -> {int z = 5; return st.age < 29 && st.avgGrade < 7;}); // если что то еще надо написать или сделать то нужны скобки {}
        System.out.println("st.course <= 3 -----------------------------------------------");
        si.testStudents(list, st -> {return st.course <= 3;});//длинный вариант написания
        System.out.println("st.sex == 'м' -----------------------------------------------");
        si.testStudents(list, st -> st.sex == 'м');
        System.out.println("---------------------");

        for (Student2 s: list){
            System.out.println(s.name);}
            System.out.println("---------------------");
            list.removeIf(x->x.name.endsWith("я"));//removeIf -удали если name заканчивается (endsWith) на "я"
        for (Student2 s: list){
            System.out.println(s.name);}
    }
}

