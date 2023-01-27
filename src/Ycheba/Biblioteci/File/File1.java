package Ycheba.Biblioteci.File;

import java.io.File;
import java.io.IOException;

class File1 {
    public static void main(String[] args) throws IOException {


        //Указав в конструкторе первым параметром путь к директории и вторым параметром имя файла в этой директории:
        File file1 = new File("D:\\program", "Test.txt");

        //Указав весь путь к файлу:
        File file2 = new File("D:\\program\\Test1.txt");

    /*Можно сначала создать объект класса File, который будет хранить в себе директорию, а потом этот объект передать в
    конструктор первым параметром, а вторым — имя файла, который хранится в этой директории. По большому счету это то же, что и в
    первом методе, но вместо строки с адресом директории мы передаем объект:

     */
        File directory = new File("D:\\program");
        File file3 = new File(directory, "Test.txt");
        System.out.println(file3.getName());// вернет имя файла
        boolean isExists = file3.exists();// проверка есть ли файл в папке
        System.out.println("Файл в папке: " + isExists);
        boolean isCreated = file2.createNewFile();//создаст по пути новый файл
        System.out.println("Файл Test1 создан в папке D:/program: " + isCreated);

        File file4 = new File("src/Main.java");// взаимодействие с файлами в каталоги Java
        boolean isFile4 = file4.exists();
        System.out.println("Файл в каталоги Java найден? " + isFile4);

        //Проверка в пути если там деректория(папка)
        File file5 = new File("src");// взаимодействие с дерикториями(папками) в Java
        boolean isDir = file5.isDirectory();
        System.out.println("Деректория(папка) в каталоги Java найден? " + isDir);

        //Проверка в пути если там деректория(папка)
        File file6 = new File("D:\\program");// взаимодействие с дерикториями(папками) на диске
        boolean isDir2 = file5.isDirectory();
        System.out.println("Деректория(папка) на жеском диске найден? " + isDir2);

        //Создание  деректория(папка)
        File file7 = new File("D:\\program\\Test3");// взаимодействие с дерикториями(папками) на диске
        boolean isMake = file7.mkdir();  // создание папки
        System.out.println("Деректория(папка) на жоском диске создана? " + isMake);

        //Удаление  деректория(папка)  Удалять можно только папки которые пустые
        File file8 = new File("D:\\program\\Test3");// взаимодействие с дерикториями(папками) на диске
        boolean isDelete = file8.delete();  // удаление папки
        System.out.println("Деректория(папка) на жоском диске создана? " + isDelete);

        //Получения списка файлов, папок в дериктории
        File file9 = new File("D:\\program");// взаимодействие с дерикториями(папками) на диске
        String[] files = file9.list();
        for (String fileName : files) {
            System.out.println("Файлы в папке program " + fileName);
        }
    }
}