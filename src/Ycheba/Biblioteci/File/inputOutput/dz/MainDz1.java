package Ycheba.Biblioteci.File.inputOutput.dz;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class MainDz1 {
    public static void main(String[] args) {
        File directory = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\dz\\folder1\\folder2\\folder3");
        File file1 = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\dz\\folder1\\folder2\\folder3\\Atest1.txt");
        File file2 = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\dz\\folder1\\folder2\\folder3\\test2.txt");
        File file3 = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\dz\\folder1\\folder2\\folder3\\test3.txt");

        try {
            directory.mkdirs();
            for (File file : Arrays.asList(file1, file2, file3)) {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File[] files = directory.getAbsoluteFile().listFiles(((dir, name) -> name.startsWith("A")));
        for (File f : files) {
            System.out.println(f);
        }
    }

}
