package Ycheba.LamdaVirogenie;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
Predicate<T>  имеет метод  boolean test(T t); который помогает фильтровать не создавая интерфейсы

 //Выведи студента удовлетворяющим хотя-бы одному из условий p1.or(p2)
        testEmployee.filtraciyaRabotnikov(arrayList, p1.or(p2));

//добавим 2 фильтрации при помощи придикейт and testEmployee.filtraciyaRabotnikov(arrayList, p1.and(p2));
 testEmployee.filtraciyaRabotnikov(arrayList, p1.and(p2));

 //Делает проверку на оборот p2.negate() что р2 меньше 200
        testEmployee.filtraciyaRabotnikov(arrayList, p2.negate());
 */
public class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
     void print(Employee e) {
        System.out.println("Имя работника - " + e.name + ", Департамент - " + e.department + ", Зарплата работника - " + e.salary);
    }

     void filtraciyaRabotnikov(ArrayList<Employee> list, Predicate<Employee> predicate) {
        for (Employee s : list) {
            if (predicate.test(s)) {
                print(s);
            }
        }
    }

    public static void main(String[] args) {
         TestEmployee testEmployee = new TestEmployee();
        ArrayList<Employee> arrayList = new ArrayList<>();
        Employee e1 = new Employee("Сергей", "ИТ", 210);
        Employee e2 = new Employee("Виктор", "Бухгалтерия", 110);
        Employee e3 = new Employee("Лена", "ИТ", 450);
        Employee e4 = new Employee("Игорь", "Техотдел", 70);
        Employee e5 = new Employee("Анна", "ИТ", 310);
        Employee e6 = new Employee("Лера", "ИТ", 170);
        Employee e7 = new Employee("ИТ", "ИТ", 170);
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        arrayList.add(e5);
        arrayList.add(e6);
        arrayList.add(e7);
        System.out.println(" arrayList.stream().filter(x->x.salary >200)--------------------------------------");
        System.out.println( arrayList.stream().filter(x->x.salary >200));
        System.out.println("employee.department.equals(\"ИТ\") && employee.salary > 200-------------------------");
        testEmployee.filtraciyaRabotnikov(arrayList, employee -> employee.department.equals("ИТ") && employee.salary > 200);
        System.out.println("employee.name.startsWith(\"Л\") && employee.salary != 450-------------------------");
        testEmployee.filtraciyaRabotnikov(arrayList, employee -> employee.name.startsWith("Л") && employee.salary != 450);
        System.out.println("employee.department.equals(employee.name)-------------------------");
        testEmployee.filtraciyaRabotnikov(arrayList, employee -> employee.department.equals(employee.name));

        //добавим 2 фильтрации при помощи придикейт and testEmployee.filtraciyaRabotnikov(arrayList, p1.and(p2));
        System.out.println("---------------------------------------------------");
        Predicate<Employee> p1 = employee -> employee.name.startsWith("Л");
        Predicate<Employee> p2 = employee -> employee.salary > 200;
        testEmployee.filtraciyaRabotnikov(arrayList, p1.and(p2));

        System.out.println("---------------------------------------------------");
        //Выведи студента удовлетворяющим хотя-бы одному из условий p1.or(p2)
        testEmployee.filtraciyaRabotnikov(arrayList, p1.or(p2));

        System.out.println("---------------------------------------------------");
        //Делает проверку на оборот p2.negate() что р2 равин или меньше 200
        testEmployee.filtraciyaRabotnikov(arrayList, p2.negate());
    }
}