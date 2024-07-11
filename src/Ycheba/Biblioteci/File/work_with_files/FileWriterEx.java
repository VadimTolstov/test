package Ycheba.Biblioteci.File.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

/*
- FileWriter - предназначит для передачи данных читаемого вида для человека txt,
при создании указываеть путь к файлу  writer = new FileWriter("путь к файлу"), если указать второй параметр в конструктаре
то в файл будут добавляться новые данные writer = new FileWriter("путь к файлу", true);, если один параметр то  файл будет перезаписываться каждый раз;
- writer.write(rubai.charAt(i)); - передаем каждый символ по очереди в файл
- writer.write(rubai) - сразу можно работать со стракой но она так же будет передаваться по символу;
- try ( FileWriter writer2 = new FileWriter("D:\\program\\IntelliJIDEA\\Proect\\new\\src\\recourse\\test1.txt"); FileWriter fileWriter = new FileWriter("test2.txt"))
 так закроем все ресурсы которые используем
 */
public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                       "Непонятного нет для меня под луной.\n" +
                       "Мне известно, что мне ничего не известно!\n" +
                       "Вот последняя правда, открытая мной.\n";


        FileWriter writer = null;
        try (FileWriter writer2 = new FileWriter("D:\\program\\IntelliJIDEA\\Proect\\new\\src\\recourse\\test1.txt");
             FileWriter fileWriter = new FileWriter("test2.txt")) {
            //1вый вариант
            for (int i = 0; i < rubai.length(); i++) {
                writer2.write(rubai.charAt(i));//автоматический кастинг до int
            }
            //2ой вариант
            fileWriter.write(rubai);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}