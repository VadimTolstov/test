package Ycheba.reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("Ycheba.reflection_examples.Employee");

        Constructor<Employee> constructor1 = employeeClass.getConstructor();//создание класса через конструктор
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);//и тут создаем класс через конструктор
        Object obj2 = constructor2.newInstance(5,"Zaur", "IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);//вызываем метод у setSalary у obj2 7/17
        method.invoke(obj2, 800.88);//заполним поле salary в Employee
        System.out.println(obj2);
    }
}
