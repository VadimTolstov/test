package Ycheba.Biblioteci.File.inputOutput;

import java.io.*;
/*
- Для побайтового чтения данных используется абстрактный класс InputStream.
- Метод read() возвращает значение прочитанного байта в пределах от 0 до 255 или -1, если данные в потоке больше нет.
- Для чтения данных из файла используется наследник InputStream - FileInputStream.
- Try с ресурсами автоматически освобождает ресурсы по завершении операции, для этого передаваемый объект должен
реализовывать интерфейс Closeable.
https://stepik.org/lesson/721126/step/1?unit=722243
 */

public class Main2 {
    public static void main(String[] args) {
        File file = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = new FileInputStream(file)) { //для чтения из файла используем класс InputStream
            int a = inputStream.read();//читает по одному символу, а когда не чего читать возвращает -1
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
