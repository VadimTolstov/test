package Ycheba.Biblioteci.File.inputOutput.dz;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
Пишем в файл через сканер и выводим данные
 */
public class MainDz4 {
    final private static String EXIT = "Выход";

    public static void main(String[] args) {
        File direct = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\dz\\dz4");
        File file = new File(direct, "dz4.txt");

        try {
            direct.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true));) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String result = scanner.nextLine();
            while (!result.equals(EXIT)) {
                outputStream.write(result.getBytes());
                outputStream.write("\n".getBytes());
                System.out.print("Введите имя: ");
                result = scanner.nextLine();


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            StringBuilder names = new StringBuilder();
            int a = inputStream.read();
            while (a > 0) {
                names.append((char) a);
                a = inputStream.read();
            }
            System.out.println(names);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
