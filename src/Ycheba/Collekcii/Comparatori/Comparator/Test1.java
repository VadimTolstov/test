package Ycheba.Collekcii.Comparatori.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*сортировка через Comparator метод compare используя не естественный порядок сортировки (как напишешь)
 * и сортировка через Comparable метод compareTo используя естественный порядок (1,2,3 или А,Б,В)*/
class Test1 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2(100, "Zaur", "Tregulov", 12345);
        Employee2 emp2 = new Employee2(15, "Ivan", "Petrov", 6542);
        Employee2 emp3 = new Employee2(123, "Zaur", "Sidorov", 12345);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Наши лист выглядит так \n" + list);
        Collections.sort(list);//сортировка по id Comparable
        System.out.println("Автоматическая сортировка \n" + list);
        Collections.sort(list, new NameComparator2());
        System.out.println("Сортировка по имени \n" + list);
        Collections.sort(list, new SalaryComparator2());
        System.out.println("Сортировка по зп \n" + list);
    }
}

class Employee2 implements Comparable<Employee2> {
    int id;
    String name;
    String surname;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", salary=" + salary +
               '}';
    }

    public Employee2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee2 anotherEmp) {//сравним созданный объект с парамертом метода
//        //если текущей объект больше чем в объект в параметре вернуть  1
//        //если меньше -1 если равны то 0
//        // 1 способ примерно то же самое  return Integer.compare(this.id, anotherEmp.id);
        // 2 способ если у нас id это Integer то return this.id.compareTo(anotherEmp.id);
        //3 способ
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }

    }
}
//class IdComparator implements Comparator<Employee> {
//
//    @Override
//    public int compare(Employee em1, Employee em2) { //здесь сравнивает два обьекта переданные
//        if (em1.id == em2.id) {
//            return 0;
//        } else if (em1.id < em2.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//}

class NameComparator2 implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 em1, Employee2 em2) { //здесь сравнивает два обьекта переданные
        return em1.name.compareTo(em2.name);
    }
}

class SalaryComparator2 implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 em1, Employee2 em2) { //здесь сравнивает два обьекта переданные
        return em1.salary - em2.salary;
    }
}
