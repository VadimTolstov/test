package Ycheba.Biblioteci.File.inputOutput.dz;

import java.io.*;

public class MainDz2 {
    public static void main(String[] args) {
        File directory = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\dz\\dz2");
        File file = new File(directory, "test.txt");

        try {
            directory.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream fileInputStream = new FileInputStream(file)) {
            int read = fileInputStream.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
