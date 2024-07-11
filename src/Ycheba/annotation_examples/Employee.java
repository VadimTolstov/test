package Ycheba.annotation_examples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
@Target показывает область кода, к которой Аннотация может быть применено. Самые распространенные области кода:
- TYPE - class, interface, enum;
- FIELD - поле класса;
- METHOD - метод класса;
- PARAMETER - параметры метода или конструктора;
@Retention описывает жизненный цикл Аннотации.
- SOURCE - Аннотация видна в source коде, отбрасывается компилятором и уже в byte коде не видна;
- CLASS - Аннотация видна в byte коде, отбрасывается JVM во время выполнения программы;
- RUNTIME - Аннотация видна во время выполнения программы;
 */
@MyAnnotation
public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @MyAnnotation
    public void increaseSalary() {
        salary *= 2;
    }
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

}

