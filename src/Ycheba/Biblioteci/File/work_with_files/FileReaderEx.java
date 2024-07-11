package Ycheba.Biblioteci.File.work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
- FileReaderEx - читаем данные из файла
- reader.read() - читает через метод read (read возвращяет int и читает до конца файла пока != -1)
-  try (FileReader reader = new FileReader("test2.txt")) - таким образом мы закроем ресурс автоматически
 */
public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("test2.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);//кастинг до char
                System.out.println();
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
