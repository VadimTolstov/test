package Ycheba.Biblioteci.File.work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/*
Надо создать CopyHere по пути указанному "D:\\program\\IntelliJIDEA\\Proect\\new\\CopyHere"
и запустить класс CopyFileTree для наполнения папки файлами
 */
public class Delete {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\program\\IntelliJIDEA\\Proect\\new\\CopyHere");
        Files.walkFileTree(path, new MyFileVisitor3());
        System.out.println("Done!");
    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete file: "+ file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete dir: "+ dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}