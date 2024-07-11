package Ycheba.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner2 {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        try (Scanner scanner = new Scanner(new FileReader(new File("D:\\program\\IntelliJIDEA\\Proect\\new\\src\\Ycheba\\scanner\\rj.txt")))) {
            scanner.useDelimiter("\\W");//делитель в тексте с регуляркой
            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }
            for (String word : set) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
