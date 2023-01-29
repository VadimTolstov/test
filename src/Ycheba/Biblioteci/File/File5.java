package Ycheba.Biblioteci.File;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Приобразования чисел с файла из строк в int
class File5 {

    public static void main(String[] args) throws IOException {
        File directory = new File("D:\\program");
        File file5 = new File(directory, "Test45.txt");
        System.out.println(file5.getName());// вернет имя файла
        boolean isExists = file5.exists();// проверка есть ли файл в папке
        System.out.println("Файл в папке: " + isExists);

        //подаем наш фал в сканер (сканер считывает любой поток данных)
        Scanner scanner = new Scanner(file5);


        //считывания с файла через массив
        String line = scanner.nextLine();

        //указываем на чем мы будем сплитеть(в данном случаи через пробел в наших словах)
        String[] numbersString = line.split(" "); //указываем на чем мы будем сплитеть(в данном случаи через пробел в наших словах)

        //Создаем массив чисел мы знаем что их будет
        int[] numbers = new int[8];
        //указывает на индекс текущий
        int counter = 0;

        //цикл для пройтись по массиву
        for (String number : numbersString){


            //parseInt Принемает на вход строку и преоброзует в int
            //на каждом числе вызываем статический метот parseInt
            //и помещяем приметив int в массив numbers
           numbers[counter++]= Integer.parseInt(number);
        }
        //Выводим содержимое массива на экран
        System.out.println(Arrays.toString(numbers));

        //выключаем сквозной поток сканера обезательно!
        scanner.close();

    }
}