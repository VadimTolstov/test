package Ycheba.Biblioteci.File.inputOutput;

import java.io.*;
/*
Используем массив и  StringBuilder для считывания данных с файла
https://stepik.org/lesson/721128/step/1?unit=722245
*/

public class Main3 {
    public static void main(String[] args) {
        File file = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = new FileInputStream(file)) { //для чтения из файла используем класс InputStream
            long before = System.currentTimeMillis();
            byte[] array = new byte[8192];//создаем массив байт
            int count = inputStream.read(array);//говорить читать сразу 1000 байт и сохранять в массив и возбраняет количество элементов которые были считаны
            StringBuilder stringBuilder = new StringBuilder();//StringBuilder для того что бы не создавать много новых String
            while (count > 0) {
                stringBuilder.append(new String(array, 0, count));// если в массив не влезет значение целиком он начнет его читать дальше и заполнит оставшуюся пустую часть
                                                                        // массива символами с начала текста для этого добавляем в (new String(array, 0, count)) 0 - это отступ
                                                                        // count - длина из скольких байтов надо создать строку
                count = inputStream.read(array);
            }
            System.out.println(stringBuilder);
            long after = System.currentTimeMillis();
            System.out.println(after-before);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
