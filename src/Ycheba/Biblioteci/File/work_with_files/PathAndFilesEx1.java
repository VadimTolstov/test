package Ycheba.Biblioteci.File.work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

/*
методы get просто показывают путь который передан в параметр   Path filePath = Paths.get("test15.txt");
и не учитывает существует файл или нет
 */
public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("D:\\program\\IntelliJIDEA\\Proect\\new\\M");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("--------------------------------------");

        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());
        System.out.println("--------------------------------------");

        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());
        System.out.println("--------------------------------------");

        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute() " + directoryPath.isAbsolute());
        System.out.println("--------------------------------------");

        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());
        System.out.println("--------------------------------------");

        System.out.println("filePath.toAbsolutePath().getParent() " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.toAbsolutePath().getRoot() " + directoryPath.toAbsolutePath().getRoot());
        System.out.println("--------------------------------------");

        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath));
        System.out.println("--------------------------------------");

        Path anotherPath = Paths.get("D:\\program\\IntelliJIDEA\\Proect\\new\\M\\N\\Z\\test20.txt");
        System.out.println("directoryPath.relativize(anotherPath) " + directoryPath.relativize(anotherPath));
        System.out.println("--------------------------------------");

        if (!Files.exists(filePath)) {//если по этому пути нет файла
            Files.createFile(filePath);//тогда создайте его
        }
        if (!Files.exists(directoryPath)) {//если по этому пути нет директории
            Files.createDirectories(directoryPath);//тогда создайте ее
        }
        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));//проверки прав файлов
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));//проверки прав файлов
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));//проверки прав файлов
        System.out.println("--------------------------------------");

        Path filePath2 = Paths.get("D:\\program\\IntelliJIDEA\\Proect\\new\\test15.txt");
        System.out.println("Files.isSameFile(filePath,filePath2) " + Files.isSameFile(filePath, filePath2));//проверки что указывает на один файл
        System.out.println("--------------------------------------");

        System.out.println("Files.size(filePath) " + Files.size(filePath));//вернет размер файла
        System.out.println("--------------------------------------");

        System.out.println("Files.getAttribute(filePath, \"creationTime\") " + Files.getAttribute(filePath, "creationTime"));//creationTime атрибут выведет информацию времени создания
        System.out.println("--------------------------------------");
        System.out.println("Files.getAttribute(filePath, \"size\") " + Files.getAttribute(filePath, "size"));//size атрибут выведет информацию о размере
        System.out.println("--------------------------------------");

        Map<String, Object> attributes = Files.readAttributes(filePath, "*");//получаем все базовые атрибуты разом
        for(Map.Entry<String, Object> entry:attributes.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
