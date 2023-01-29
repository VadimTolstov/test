package Ycheba.Biblioteci.File;


import java.io.File;

//Определение  размера каталога с файлами. На выходе получим размер
//Файла в мегабайтах
class File2 {
    public static void main(String[] args) {
        File folder = new File("D:\\program"); //Ваша папка
        long size = getFolderSize(folder);
        System.out.println((size / 1024 / 1024) + " MB");
    }

    private static long getFolderSize(File folder) {
        //Получить все имена присутствующих файлов в данном каталоге
        File[] files = folder.listFiles();
        long length = 0;
        int count = files.length;
        for (int i = 0; i < count; i++) {
            //Проверка, является ли объект файлом isFile()
            if (files[i].isFile()) {
                //Получаем размер файла в байтах files[i].length()
                length += files[i].length();
            } else {
                length += getFolderSize(files[i]);
            }
        }
        return length;
    }
}

