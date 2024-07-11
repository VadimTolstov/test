package Ycheba.Biblioteci.File.inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*
Перемещаемся по позиции с файлом пишем и читаем в файле
https://stepik.org/lesson/721132/step/1?unit=722249 */
public class Main8 {
    public static void main(String[] args) {
        File file = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\1.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
//            randomAccessFile.seek(10);//перемеряемся к 10 позиции
//            randomAccessFile.writeBytes("************************************************");
//            randomAccessFile.seek(30);//перемеряемся к 10 позиции
//            randomAccessFile.writeBytes("************************************************");
//            randomAccessFile.seek(40);//перемеряемся к 10 позиции
//            randomAccessFile.writeBytes("************************************************");

            randomAccessFile.seek(5000);
            byte[] array = new byte[1024];
            randomAccessFile.read(array);
            System.out.println(new String(array));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
