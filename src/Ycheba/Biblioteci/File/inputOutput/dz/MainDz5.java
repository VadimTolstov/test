package Ycheba.Biblioteci.File.inputOutput.dz;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
Пишем в файл через сканер и выводим данные
 */
public class MainDz5 {
    final private static String EXIT = "Выход";

    public static void main(String[] args) {
        File file = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\1.txt");

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер страницы: ");
            String list = scanner.nextLine();
            byte[] array = new byte[3000];
            while (!list.equals("stop")) {
                randomAccessFile.seek((Long.parseLong(list) - 1L) * array.length);
                int count = randomAccessFile.read(array);
                System.out.println(new String(array, 0, count));
                System.out.print("Введите номер страницы или stop: ");
                list = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
