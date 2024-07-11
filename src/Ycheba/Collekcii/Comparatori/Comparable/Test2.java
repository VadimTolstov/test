package Ycheba.Collekcii.Comparatori.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*сортировка через Comparable метод compareTo*/
public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Zaur", "Sidorov", 12345);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Наши лист выглядит так \n" + list);
        Collections.sort(list);
        System.out.println("Автоматическая сортировка \n" + list);
    }
}

class Employee implements Comparable<Employee> {
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

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee anotherEmp) {//сравним созданный объект с парамертом метода
        //если текущей объект больше чем в объект в параметре вернуть  1
        //если меньше -1 если равны то 0
        // 1 способ примерно то же самое  return Integer.compare(this.id, anotherEmp.id);
        // 2 способ если у нас id это Integer то return this.id.compareTo(anotherEmp.id);
        //3 способ
//        if (this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }
        //4 способ сортировка по String
        //return this.name.compareTo(anotherEmp.name);
        //5 способ
        //return this.id-anotherEmp.id
        //6 способ если несколько сравнений
        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}
