package Ycheba.Biblioteci.File.work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/*
https://cloud.mail.ru/public/2ivK/2NNL8oJHY/9.%20Работа%20с%20файлами%20IO%20и%20NIO/17.%20Метод%20walkFileTree.%20Копирование%20директории.mp4
 */
public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("D:\\program\\IntelliJIDEA\\Proect\\new\\X");
        Path destination = Paths.get("D:\\program\\IntelliJIDEA\\Proect\\new\\CopyHere");
        //source - откуда надо начинать хождение по файловому дереву и new MyFileVisitor2(source, destination) - что должно происходить при хождении
        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
        System.out.println("Done!");
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {

    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        //формула копирования директорий
        Path newDestination = destination.resolve(source.relativize(dir));                           //source.relativize(dir) получаем относительный путь  source к dir
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);//копируем здесь папку(какую и куда)    //destination.resolve(source.resolve(source.relativize(dir))) resolve соединяет 2 пути
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        //аналогично как выше для файлов
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}