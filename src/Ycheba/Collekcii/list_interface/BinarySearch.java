package Ycheba.Collekcii.list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Collections.binarySearch(arrayList, 19); ищет в листе указанные значения 19, и возвращяет его индекс в листе
// но надо всегда сортеровать лист
//Collections.reverse(arrayList);// сортировка обратно ------------------------
//Collections.shuffle(arrayList);// перемешаем лист ------------------------
// Collections.sort(arrayList);//сначало сортируем перед поиском элемента----------
public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        arrayList.add(69);
        Collections.sort(arrayList);//сначало сортируем перед поиском элемента----------
        System.out.println("Отсортированный лист " + arrayList);
        int index = Collections.binarySearch(arrayList, 12);//ищем элемент 19 в arrayList всегда сначало сортируй
        //если после сортировки возращаяется отрицательное значение значит элемента нет в колекции
        System.out.println("Индекс в листе искомого элемента " + index);
        Collections.reverse(arrayList);// сортировка обратно ------------------------
        System.out.println("Отсортированный массив в обратную сторону " + arrayList);
        Collections.shuffle(arrayList);// перемешаем лист ------------------------
        System.out.println("Перемешанный лист " + arrayList);
    }
}


class Employee3 implements Comparable<Employee3> {
    int id;
    String name;
    int salary;

    public Employee3(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", salary=" + salary +
               '}';
    }

    @Override
    public int compareTo(Employee3 anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}

class Test10 {
    public static void main(String[] args) {
        Employee3 emp1 = new Employee3(100, "Zaur", 12345);
        Employee3 emp2 = new Employee3(15, "Ivan", 6542);
        Employee3 emp3 = new Employee3(123, "Petr", 8542);
        Employee3 emp4 = new Employee3(15, "Mariya", 5678);
        Employee3 emp5 = new Employee3(182, "Kolya", 125);
        Employee3 emp6 = new Employee3(15, "Sasha", 9874);
        Employee3 emp7 = new Employee3(250, "Elena", 1579);

        List<Employee3> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println("Не сортированный лист " + employeeList);
        Collections.sort(employeeList);
        System.out.println("Сортированный лист " + employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee3(182, "Kolya", 125));//----- ищем классы в листе
        System.out.println(index2);

        //Сортируем массив и выводим индекс в массиве
        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        Arrays.sort(array);
        System.out.println("Отсортированный массив " + Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 150);
        System.out.println("Индекс в массиве " + index3);
    }
}