package Ycheba.Biblioteci.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {

    static int abc() {
        try {
            File file = new File("test10.txt");
            FileInputStream fis = new FileInputStream(file);
            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка поймана");
            return 6;
        } finally {
            System.out.println("Это блок файноли");
            return 7; //если catch и  finally есть return то вернется из finally
        }
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}

class Test9 {
    static int abcf() {
        int a = 5;
        try {
            File file = new File("test10.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка поймана");
            System.out.println("Переменная а в catch = " + a);
            return a;// при вылете исключения а вернется от сюда а не из finally
        } finally {
            a = 10;
            System.out.println("Это блок файноли");
            System.out.println("Переменная а в finally блоке = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abcf());
    }
}

class Test10 {
    static StringBuilder abcl() {
        StringBuilder a = new StringBuilder("привет");
        try {
            File file = new File("test10.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка поймана");
            System.out.println("Переменная а в catch = " + a);
            return a;//ссылка на а возрашается от сюда но в finally мы меняем сам обьект
        } finally {
            a.append("!!!!");//при выполнении мы изменим значение а в StringBuilder и оно будет с !!! знаками
            System.out.println("Это блок файноли");
            System.out.println("Переменная а в finally блоке = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abcl());
    }
}