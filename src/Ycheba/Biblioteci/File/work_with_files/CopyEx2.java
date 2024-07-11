package Ycheba.Biblioteci.File.work_with_files;

import java.io.*;

/*
Копируем бинарные файлы
 */
public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("img.png");
             FileOutputStream outputStream = new FileOutputStream("test9.png")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
