package Ycheba.Biblioteci.Exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Создадим метод для обработки исключения
class Exceptions2 {
    public static void main(String[] args) {

        try {
            readFiel();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методи main ");
        }

    }

    public static void readFiel() throws FileNotFoundException{
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }

}



