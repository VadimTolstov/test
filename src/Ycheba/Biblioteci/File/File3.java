package Ycheba.Biblioteci.File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Получение данных из файла способ первый

class File3 {
    public static void main(String[] args) throws IOException {
        File directory = new File("D:\\program");
        File file3 = new File(directory, "Test.txt");
        System.out.println(file3.getName());// вернет имя файла
        boolean isExists = file3.exists();// проверка есть ли файл в папке
        System.out.println("Файл в папке: " + isExists);

        //подаем наш фал в сканер (сканер считывает любой поток данных)
        Scanner scanner = new Scanner(file3);
        //считать все стоки в файле
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        //выключаем сквозной поток сканера обезательно!
        scanner.close();

    }
}