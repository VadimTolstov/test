package Ycheba.Biblioteci.File.work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


/*
- FileVisitResult - есть 4 значения
- CONTINUE - означает, что нужно продолжать обход по файлам;
- TERMINATE - означает, что нужно немедленно прекратить обход по файлам;
- SKIP_SUBTREE - означает, что в данную директорию заходить не надо;
- SKIP_SIBLINGS - означает, в данной директории продолжать обход по файлам не нужно.

 - Ниже описан способ как прогуляться по дереву и файлам
 */

public class FileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\program\\IntelliJIDEA\\Proect\\new\\X");
        Files.walkFileTree(path, new MyFileVisitor());
    }
}

class MyFileVisitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }
}