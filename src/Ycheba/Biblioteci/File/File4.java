package Ycheba.Biblioteci.File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Получения данных с файла способ второй
class File4 {
    public static void main(String[] args) throws IOException {
        File directory = new File("D:\\program");
        File file4 = new File(directory, "Test.txt");
        System.out.println(file4.getName());// вернет имя файла
        boolean isExists = file4.exists();// проверка есть ли файл в папке
        System.out.println("Файл в папке: " + isExists);

        //подаем наш фал в сканер (сканер считывает любой поток данных)
        Scanner scanner = new Scanner(file4);


        //считывания с файла через массив
        String line = scanner.nextLine();

        //указываем на чем мы будем сплитеть(в данном случаи через пробел в наших словах)
        String[] numbers = line.split(" "); //указываем на чем мы будем сплитеть(в данном случаи через пробел в наших словах)

        //Выводим массив на экран
        System.out.println(Arrays.toString(numbers));

        //выключаем сквозной поток сканера обезательно!
        scanner.close();

    }
}