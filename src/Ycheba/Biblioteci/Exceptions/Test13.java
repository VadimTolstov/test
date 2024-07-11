package Ycheba.Biblioteci.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test13 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("src\\resurse\\tests15.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("fis2 test10.txt не найден");
            }
        } catch (FileNotFoundException e) {
            System.out.println("fis1 test9.txt  не найден");
        } finally {
            System.out.println("Это внешний файноли блок");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Найдено исключение в файноле блоке ");
            }
        }
    }

    public static void main(String[] args) {
        Test13 tes13 = new Test13();
        tes13.abc();
    }
}
