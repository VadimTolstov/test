package Ycheba.stream;

import java.util.Arrays;

/*
forEach выводим все по отдельности
:: - что это такое это класс и обращение к его метаду смотри ниже
 */
public class Test3 {
    public static void main(String[] args) {
        int[] array = {5,9,3,8,1};
        Arrays.stream(array).forEach(element
        -> {element*=2;
            System.out.println(element);});
        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utils::myMethod);//каждый элемент потока помести в классе Utils в метод myMethod
        Arrays.stream(array).forEach(el ->Utils.myMethod(el));//тоже самое что выше
    }
}

class Utils{
    public static void myMethod(int a) {
        a=a+5;
        System.out.println("Element = " + a);
    }
}