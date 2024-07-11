package Ycheba.Collekcii.set_interface;

import java.util.Objects;
import java.util.TreeSet;

/*деревья работают только с сортировкой
treeSet.first() возвращает первого в листе
treeSet.last() возвращает последнего в листе
treeSet.headSet(st6) выведет всех ниже st6
treeSet.tailSet(st6) выведет всех выше и включительно st6
treeSet.subSet(st6, st7) выведет значение ниже st7 и выше или равных st6

есть правило если a.equals(b)  -> true
тогда a.compareTo(b) должно возвращать 0
строчка 57
 */
public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Zaur",5);
        Student st2 = new Student("Mariya",1);
        Student st3 = new Student("Sergey",2);
        Student st4 = new Student("Igor",3);
        Student st5 = new Student("Vasiliy",4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        System.out.println("first "+treeSet.first());
        System.out.println("last "+treeSet.last());
        Student st6 = new Student("Valera",2);
        Student st7 = new Student("Genri",4);
        System.out.println("headSet "+treeSet.headSet(st6));
        System.out.println("tailSet "+treeSet.tailSet(st6));
        System.out.println("subSet "+treeSet.subSet(st6, st7));
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