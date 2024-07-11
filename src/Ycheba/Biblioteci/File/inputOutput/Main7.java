package Ycheba.Biblioteci.File.inputOutput;

import java.io.*;
import java.util.Scanner;

/*
Читаем данные с консоли System.in
https://stepik.org/lesson/721130/step/1?unit=722247
 */
public class Main7 {
    public static void main(String[] args) {
        File file = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\1.txt");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        System.out.println("You entered: " +result);
    }
}
