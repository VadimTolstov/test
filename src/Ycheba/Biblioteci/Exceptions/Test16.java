package Ycheba.Biblioteci.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test16 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("src\\resurse\\tests15.txt");
            System.out.println("fis1 tests15.txt существует и найден");
            try {
                fis2.close();
            }catch (IOException e ){
                System.out.println("Вышли проблемы со стриомо fis2");
            }
        }catch (FileNotFoundException e){
            System.out.println("Файл tests15 не найден ");
        } catch (NullPointerException e){
            System.out.println("Сработал NullPointerException");
        }
    }
}
