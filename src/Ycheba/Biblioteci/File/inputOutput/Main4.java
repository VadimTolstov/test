package Ycheba.Biblioteci.File.inputOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;
/*
Reader для использовании указанной кодировки
https://stepik.org/lesson/721128/step/1?unit=722245
*/

public class Main4 {
    public static void main(String[] args) {
        File file = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Reader reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {//указываем кодировку Reader по умолчанию указывает кодировку UTF_8
            int a = reader.read();
            StringBuilder result = new StringBuilder();
            while (a > 0) {
                result.append((char) a);
                a = reader.read();
            }
            System.out.println(result);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
