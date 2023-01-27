package Ycheba.Biblioteci.Math;

//  нахождение модуля числа (abc);
//  нахождение максимального из двух чисел (max);
//  нахождение минимального из двух чисел (min);
//  import static java.lang.Math.pow; - так импортируется класс и можно вызывать только метод

public class Mathematics {
    public static double abs(double num) {
        return Math.abs(num);
    }

    public static int max(int a, int b) {
        // Напишите здесь свой код
        return Math.max(a, b);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {

        int a = -6, b = -3;

        System.out.println(abs(a));
        System.out.println(max(a, b));
        System.out.println(min(a, b));
    }
}

