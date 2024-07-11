package Ycheba.Biblioteci.File.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
- Класс RandomAccessFile позволяет читать информацию из любого места файла и записывать информацию в любое место файла
- RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) - в конструктом передаем путь до файла и режимы
rw - можем читать и писать
r - только писать
w - только читать
 */

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {
            int a = file.read(); //выведет символ и курсор останется стоять за ним дальше
            System.out.println((char) a);
            String s1 = file.readLine(); //выведет строчку и курсор стоит дальше
            System.out.println(s1);

            file.seek(101);//перемещаем курсор на позицию 101
            String s2 = file.readLine(); //выведет строчку
            System.out.println(s2);

            long position = file.getFilePointer();
            System.out.println(position);//получим позицию курсора

            file.seek(0);//перемещаем курсор на позицию 0
            file.writeBytes("privet");//пишем в файл поверх текущих байтов

            file.seek(file.length()-1);//перемещяемся в конец файла
            file.writeBytes("\n\t\t\t\t\t\tWilliam Butler Yeats");//пишем в конец файла

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
