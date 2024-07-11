package Ycheba.Biblioteci.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        File file = new File("test8.txt"); //абстракная репрезинтация пути к файлу или папке
        FileInputStream fis = new FileInputStream(file); // Предназначен для создания потока, с помощью которого можно читать информацию из источника. могут выкидывать исключения FileNotFoundException если файла нет
        System.out.println("файл найден");
        fis.read();//читать, могут выкидывать исключения IOException
        FileOutputStream fos = new FileOutputStream(file);// Предназначен для создания потока, с помощью которого можно писать информацию из источника. могут выкидывать исключения FileNotFoundException если файла нет
        fos.write(100);//писать, могут выкидывать исключения IOException
    }
}
