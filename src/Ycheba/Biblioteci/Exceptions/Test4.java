package Ycheba.Biblioteci.Exceptions;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

        int[] array = {4, 8, 1,};
        System.out.println("У нас есть массив ");
        try {
            System.out.println(array[5]);
            System.out.println("Всем хорошего дня !  ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("---------------->");
            System.out.println("Сообщение с ошибкой " + e.getMessage());
            System.out.println("Была поймана ошибка " + e);
            e.printStackTrace();//стектрейс с местом ошибки at Ycheba.Biblioteci.Exceptions.Test4.main(Test4.java:9)
            //так получают подавленные исключение в блоке try или с использованием try-with-resources
            System.out.println("Thrown exception=>" + e.getMessage());
            Throwable[] suppressedExceptions = e.getSuppressed();//получаем подавленное исключение
            System.out.println(Arrays.toString(suppressedExceptions));
        } finally {
            System.out.println("Это файноли блок ");
        }
        System.out.println("Данный код уже не имеет отношение к исключению !");
    }
}
