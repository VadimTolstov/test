package Ycheba.Biblioteci.Exceptions;

import java.io.IOException;
import java.util.Scanner;

class Exceptions1a {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //Считываем числа и преобразуем в приметивы
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Пользователь ввел что то кроме нуля: ");;
                }

            }
        }
    }
}
