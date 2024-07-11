package Ycheba.Biblioteci.File.inputOutput;

import java.io.*;

/*
Пишем в файл
https://stepik.org/lesson/721130/step/1?unit=722247
 */
public class Main5 {
    public static void main(String[] args) {
        File file = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\3.txt");
        try (OutputStream outputStream = new FileOutputStream(file)) {//так данные перезаписываются в файл
        //try (OutputStream outputStream = new FileOutputStream(file, true)) {//добавляем (file, true) и данные добавляются в файл дальше, а не перезаписывают его
            String names = "John Max Nick Thomas Andrew Roman Herbert Alex";
            outputStream.write(names.getBytes());//пишем в файл используя .getBytes()
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
