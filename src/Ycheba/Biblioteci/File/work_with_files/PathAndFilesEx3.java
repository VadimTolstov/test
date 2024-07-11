package Ycheba.Biblioteci.File.work_with_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
Можем читать и писать в файле при помощи Files
- Files.createFile(filePath); создать файл
- Files.write(filePath, dialog.getBytes()); пишем в файл
-  List<String> list = Files.readAllLines(filePath); читаем файл получаем лист с него и может что то делать с ним
 */
public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test25.txt");
      //  Files.createFile(filePath);//создаем файл

        String dialog = """
                - Привет
                - Привет
                - Как дела?
                - Хорошо!
                - Как у тебя дела?
                - То-же хорошо!""";
        //    Files.write(filePath, dialog.getBytes());// пишем в файл

        List<String> list = Files.readAllLines(filePath);// читаем с файла
        for (String f : list) {
            System.out.println(f);
        }
    }
}
