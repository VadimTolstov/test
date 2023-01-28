package Ycheba.Biblioteci.Exceptions;

import java.io.IOException;
import java.util.Scanner;

//Создим свой клас с выводом ошибки наследника Exceptions
class Exceptions6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //Считываем числа и преобразуем в приметивы
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                //throw выбросить исключения
                throw new SecurityException("Пользователь ввел что-то кроме нуля ");


            }
        }
    }
}

//Создали наследника
class ScannerExceptions extends Exception {
    public ScannerExceptions(String description){
        super(description);
    }

}