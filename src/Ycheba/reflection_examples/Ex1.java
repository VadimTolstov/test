package Ycheba.reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //3 способа создания Class
        Class employeeClass = Class.forName("Ycheba.reflection_examples.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();
        Field someField = employeeClass.getField("id");//можем узнать какого вида поля id у класса Employee
        System.out.println("Type of id field = " + someField);
        System.out.println("-----------------------------------------------");

        Field[] fields = employeeClass.getFields();//вернет все поля кроме приватного
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("-----------------------------------------------");

        Field[] allFields = employeeClass.getDeclaredFields();// получаем все поля и  приватные
        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("-----------------------------------------------");

        Method someMethod1 = employeeClass.getMethod("increasesSalary");// выводим информацию о методе
        System.out.println("Return type of method increaseSalary = " + someMethod1.getReturnType() +
                           ", parameter types = " + Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("-----------------------------------------------");

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);// выводим информацию о методе c параметрами
        System.out.println("Return type of method setSalary = " + someMethod2.getReturnType() +
                           ", parameter types = " + Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("******************************************************************************************");

        Method[] methods = employeeClass.getMethods();//выводим информацию о всех методах (кроме приватных) да же о тек которые были унаследованы от родителей
        for (Method method : methods) {
            System.out.println("Name of method  = " + method.getName() +
                               ", return types = " + method.getReturnType() +
                               ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("-----------------------------------------------");

        Method[] allMethods = employeeClass.getDeclaredMethods();//возвращает методы и приватные в классе и переопределенные
        for (Method method : allMethods) {
            System.out.println("Name of method  = " + method.getName() +
                               ", return types = " + method.getReturnType() +
                               ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("-----------------------------------------------");

        Method[] allMethods2 = employeeClass.getDeclaredMethods();//возвращает методы публичные в классе
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers())) { // здесь фильтруем что метод должен быть публичным
                System.out.println("Name of method  = " + method.getName() +
                                   ", return types = " + method.getReturnType() +
                                   ", parameter types = " + Arrays.toString(method.getParameterTypes()));
            }
        }
        System.out.println("-----------------------------------------------");

        Constructor constructor1 = employeeClass.getConstructor();//получаем данные о конструкторе без параметров
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                           ", parameters, their types are: " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("-----------------------------------------------");

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);//получаем данные о конструкторе c параметрами
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                           ", parameters, their types are: " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("-----------------------------------------------");
        Constructor[] constructors = employeeClass.getConstructors();//получаем данные о конструкторах всех
        for (Constructor constructor : constructors) {
            System.out.println("Constructor " + constructor.getName() +
                               ", has " + constructor.getParameterCount() +
                               ", parameters, their types are: " + Arrays.toString(constructor.getParameterTypes()));
        }
        System.out.println("-----------------------------------------------");
        Constructor[] constructors2 = employeeClass.getDeclaredConstructors();//получаем данные о конструкторах всех и приватных в том числе
        for (Constructor constructor : constructors2) {
            System.out.println("Constructor " + constructor.getName() +
                               ", has " + constructor.getParameterCount() +
                               ", parameters, their types are: " + Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
