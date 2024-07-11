package Ycheba.Biblioteci.File.inputOutput;

import java.io.*;

/*
Читаем через BufferedInputStream
https://stepik.org/lesson/721130/step/1?unit=722247
 */
public class Main6 {
    public static void main(String[] args) {
        File file = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\1.txt");

        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            long before = System.currentTimeMillis();
            int a = inputStream.read();
            StringBuilder result = new StringBuilder();
            while (a != -1) {
                result.append((char) a);
                a = inputStream.read();
            }
            long after = System.currentTimeMillis();
            System.out.println(after-before);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
