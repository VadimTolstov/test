package Ycheba.LamdaVirogenie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
/*
Function принимает <T> возвращает <T>
 */
public class Test1 {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", sex=" + sex +
               ", age=" + age +
               ", course=" + course +
               ", avgGrade=" + avgGrade +
               '}';
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Imya studenta: " + st.name + ", pol: " + st.sex + ", vozrast: " + st.age + ", kurs: "
                           + st.course + ", srednyaya ocenka: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student> aL, StudentChecks sc) {
        for (Student s : aL) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Иван", 'м', 22, 3, 8.3);
        Student st2 = new Student("Виктор", 'м', 28, 2, 6.4);
        Student st3 = new Student("Анна", 'ж', 19, 1, 8.9);
        Student st4 = new Student("Лера", 'ж', 35, 4, 7);
        Student st5 = new Student("Таня", 'ж', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        //сортировка через лямдовырожение
        Collections.sort(list, (stud1, stud2) -> (stud1.name.compareTo(stud2.name)));
        System.out.println("Collections.sort(list, (stud1, stud2) ->(stud1.name.compareTo(stud2.name)))--------------------------------------");
        System.out.println(list);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course - s2.course;
            }
        });
        System.out.println(" Collections.sort(list, new Comparator<Student>()-----------------------------------------");
        System.out.println(list);

        StudentInfo si = new StudentInfo();
        System.out.println(" st.avgGrade > 8.5 -----------------------------------------------");
        si.testStudents(list, (Student st) -> st.avgGrade > 8.5);//лямда выражение и его можно использовать если с интерфейсе оди метод одно и тоже (Student st) -> {return st.avgGrade > 8.5;}
        System.out.println(" st.avgGrade > 9 -----------------------------------------------");
        si.testStudents(list, st -> st.avgGrade > 9);//можно не брать в скобки джава понимает что у интерфейса один метод boolean test(Student s) и он принимает в нем (Student s)
        System.out.println(" st.age < 29 && st.avgGrade < 7 -----------------------------------------------");
        si.testStudents(list, (Student st) -> {
            int z = 5;
            return st.age < 29 && st.avgGrade < 7;
        }); // если что то еще надо написать или сделать то нужны скобки {}
        System.out.println("st.course <= 3 -----------------------------------------------");
        si.testStudents(list, (Student st) -> {
            return st.course <= 3;
        });//длинный вариант написания
        System.out.println("st.sex == 'м' -----------------------------------------------");
        si.testStudents(list, (Student st) -> st.sex == 'м');

        System.out.println("Используем ананимный класс -----------------------------------------------");
        si.testStudents(list, new StudentChecks() {
            @Override
            public boolean test(Student s) {
                return s.age < 28;
            }
        });
        System.out.println("avgOfSmth -----------------------------------------------------------------");
        double res = avgOfSmth(list, student -> student.avgGrade);
        System.out.println("avgOfSmth " + res);
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {//тут используем Function он принемает Student и возвращяет Double
        double result = 0;
        for (Student st : list) {
            result += f.apply(st);//вызываем у f метод apply и подаем парамерт st (Student) и дальше согласно логике
        }
        result = result / list.size();
        return result;
    }
}

interface StudentChecks {
    boolean test(Student s);//один метод в интерфейсе
}