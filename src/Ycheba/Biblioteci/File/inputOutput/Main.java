package Ycheba.Biblioteci.File.inputOutput;

import java.io.File;
import java.io.IOException;

/*
создаем директории и файлы
https://stepik.org/lesson/721124/step/1?unit=722241
 */
public class Main {
    public static void main(String[] args) {
        File directory = new File("D:\\program\\IntelliJIDEA\\Proect\\new\\src\\Ycheba\\Biblioteci\\File\\inputOutput\\folder1\\folder2\\folder1");
        File file = new File("D:\\program\\IntelliJIDEA\\Proect\\new\\src\\Ycheba\\Biblioteci\\File\\inputOutput\\folder1\\folder2\\folder1\\file1.txt");
        File file2 = new File("D:\\program\\IntelliJIDEA\\Proect\\new\\src\\Ycheba\\Biblioteci\\File\\inputOutput\\folder1\\folder2\\folder1\\file2.txt");
        File file3 = new File("D:\\program\\IntelliJIDEA\\Proect\\new\\src\\Ycheba\\Biblioteci\\File\\inputOutput\\folder1\\folder2\\folder1\\file3.txt");
        try {
       //     directory.mkdir();//создаем одну директорию
            directory.mkdirs();//создаем всю цепочку директорию
            file.createNewFile();//создаем файл
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.getName());//имя файла
        System.out.println(file.exists());//существует ли файл
        System.out.println(file.isDirectory());//проверяем директория ли это
        System.out.println(file.isFile());//проверяем ли это файлом если файла нет вернет так же фолс

        File[] files = directory.listFiles();//получаем массив файлов в директории
        for (File f :files){
            System.out.println(f);
        }
        System.out.println("-----------------------------");

        File[] files2 = directory.listFiles((dir, name) -> name.contains("1"));//получаем массив отсортированных файлов
        for (File f :files2){
            System.out.println(f);
        }
    }
}
