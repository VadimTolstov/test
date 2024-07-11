package Ycheba.Biblioteci.File.work_with_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;

/*
- Files.copy не копирует сразу все содержимое папки
- Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING); копировать файл
 filePath - что копируем directoryPath.resolve(filePath) -куда копируем (название файла)
 StandardCopyOption.REPLACE_EXISTING - если файл с таким именем есть то заменит его
-  Files.move(filePath,directoryPath.resolve(filePath)); перемещает файлы и директории и может переименовывать их
- Files.delete(Paths.get("test21.txt")); удаляет указанный файл или директорию не удалит директория если она не пуста
 */
public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("D:\\program\\IntelliJIDEA\\Proect\\new\\M");
        Path directoryBPath = Paths.get("D:\\program\\IntelliJIDEA\\Proect\\new\\B");

     //   Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);//resolve присоединяет к пути название
       // Files.copy(filePath, directoryPath.resolve("test16.txt"));
     //   Files.copy(directoryBPath,directoryPath.resolve("B"));

//        Files.move(filePath,directoryPath.resolve(filePath));
//        Files.move(Paths.get("test111.txt"), Paths.get("test110.txt"));

        File file = new File("test21.txt");
        file.createNewFile();
        Files.delete(Paths.get("test21.txt"));
    }
}
