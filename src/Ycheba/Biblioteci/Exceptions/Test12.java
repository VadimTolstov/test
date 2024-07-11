package Ycheba.Biblioteci.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test12 {
    void abc() throws FileNotFoundException {
        try {
            File file = new File("test10.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка поймана немного обработана");
            try {
                throw e;
            } catch (FileNotFoundException exception) {
            }
        } finally {
            System.out.println("Это блок файноли");
        }
    }

    void def() {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка поймана немного обработана");
            throw e;
        } finally {
            System.out.println("Это блок файноли");
        }
    }
}
