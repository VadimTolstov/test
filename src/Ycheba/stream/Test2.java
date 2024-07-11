package Ycheba.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
filter фильтрует лист
 */
public class Test2 {
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
        students = students.stream().filter(element
                        -> element.getAge() > 22 && element.getAvgGrade() < 7.2)
                .collect(Collectors.toList());
        System.out.println(students);

        //здесь просто создаем стрим и добовляем в него студентов затем обрабатываем их
        Stream<Student> myStream = Stream.of(st1,st2,st3,st4,st5);
        myStream.filter(element
                -> element.getAge()>22 && element.getAvgGrade()<7.2).collect(Collectors.toList());
    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    private double avgGrade;

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