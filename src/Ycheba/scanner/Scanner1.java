package Ycheba.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Напишите 2 числа ");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Частное = " + x/y);
//        System.out.println("Частное = " + x%y);

        System.out.print("Напишите пару слов ");
        String s = scanner.nextLine(); //передаст всю строку целиком
        System.out.println("Вы написали: " + s);

        System.out.print("Напишите пару слов ");
        String s2 = scanner.next();// передаст первое слово до пробела
        System.out.println("Вы написали: " + s2);

        System.out.print("Введите число: ");
        double d1 = scanner.nextDouble();//принимает данные через запятую
        System.out.println("Вы написали: " + d1);
    }
}

class ScannerN {
    public static void main(String[] args) {
        //выводим данные которые идут с новой строки, если вывести 4 строку выйдет ошибка т.к 4 строки нет
        Scanner scanner = new Scanner("Привет мой друг! \nКак твои дела? \nЧто хорошего?");
        while (scanner.hasNextLine()){ // используем hasNextLine что бы не получить ошибку он проверяет есть дальше что то или нет
            System.out.println(scanner.nextLine());
        }

        System.out.println(scanner.next().charAt(3));//выводим символ по номеру
    }
}