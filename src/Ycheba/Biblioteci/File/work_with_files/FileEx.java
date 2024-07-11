package Ycheba.Biblioteci.File.work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/*
-Класс File позволяет управлять информацией о файлах и директориях
- .getAbsolutePath() показывает абсолютный путь до файла
- .isAbsolute() проверяет абсолютный путь до файла указан или нет
- .isDirectory() проверяет файл или директория
- .exists() проверяет существует файл или нет
- .createNewFile() создает указанный файл
- .mkdir()  создает указанную директорию создает указанный файл
- .length() возвращает размер файла
- .delete() удаляет файл или директорию (если директория не пуста не удалит директорию)
- listFiles() возвращает массив файлов и директории в указанной директории
- .isHidden() проверит скрыт файл или нет
- .canRead() проверяем есть ли у нас права читать файл
- .canWrite() проверяем есть ли у нас права писать в файл
- .canExecute() проверяем есть ли у нас права запускать файл
 */
public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File folder = new File("A");
        File file2 = new File("A\\test20.txt");
        File folder2 = new File("B");
        File file3 = new File("A\\test30.txt");

        System.out.println("file.getAbsolutePath() " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() " + folder.getAbsolutePath());
        System.out.println("--------------------------");

        System.out.println("file.isAbsolute() " + file.isAbsolute());
        System.out.println("folder.isAbsolute() " + folder.isAbsolute());
        System.out.println("--------------------------");

        System.out.println("file.exists() " + file.exists());
        System.out.println("folder.exists() " + folder.exists());
        System.out.println("file2.exists() " + file2.exists());
        System.out.println("folder2.exists() " + folder2.exists());
        System.out.println("--------------------------");

        System.out.println("file2.createNewFile() " + file2.createNewFile());
        System.out.println("folder2.mkdir() " + folder2.mkdir());
        System.out.println("--------------------------");

        System.out.println("file2.length() " + file2.length());
        System.out.println("folder.length() " + folder.length());
        System.out.println("--------------------------");

        System.out.println("folder.delete() " + folder.delete());
        System.out.println("file2.delete() " + file2.delete());
        System.out.println("folder2.delete() " + folder2.delete());
        System.out.println("--------------------------");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("--------------------------");

        System.out.println("file2.isHidden() " + file3.isHidden());
        System.out.println("file3.canRead() " + file3.canRead());
        System.out.println("file3.canWrite() " + file3.canWrite());
        System.out.println("file3.canExecute() " + file3.canExecute());
        System.out.println("--------------------------");
    }
}
