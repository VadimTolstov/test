package Ycheba.Biblioteci.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Обработка исключений, нет файла в корне папки
class Exceptions1 {
    public static void main(String[] args) {
        File file = new File("test");

        //код который вызывает исключения находится в try
        try {
            Scanner scanner = new Scanner(file);//Если исключения выбрасывается
                                                //после кода Scanner то дальше он
                                                //не выполняется а переходит к catch

            System.out.println(" После Scanner");

            // В catch находится обработка исключения, если исключение не произойдет
        } catch (FileNotFoundException e) { // блок catch не будет выполнен
            //Выводим свою подсказку в консоль
            System.out.println("Файл не найден");
        }
        //Выполняем программу после блока try catch и все работает
        System.out.println("После блока try catch можем выполнять программу ");
    }


}
