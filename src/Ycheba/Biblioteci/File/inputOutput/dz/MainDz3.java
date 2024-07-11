package Ycheba.Biblioteci.File.inputOutput.dz;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainDz3 {
    public static void main(String[] args) {
        File directory = new File("src\\Ycheba\\Biblioteci\\File\\inputOutput\\dz\\dz3");
        File file = new File(directory, "name.txt");
        String name;
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            char[] array = new char[1024];
            int count = reader.read(array);
            StringBuilder stringBuilder = new StringBuilder();
            while (count > 0) {
                stringBuilder.append(new String(array, 0, count));
                count = reader.read(array);
            }
            name = String.valueOf(stringBuilder);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> listName = List.of((name.split(" ")));
        System.out.println(listName);
        List<String> collect = listName.stream()
                .filter(x -> x.startsWith("А"))
                .toList();
        System.out.println(collect);

        String[] listName2 = (name.split(" "));
        System.out.println(Arrays.toString(listName2));
        List<String> collect2 = Arrays.stream(listName2)
                .filter(x -> x.startsWith("А"))
                .collect(Collectors.toList());
        System.out.println(collect2);

        String[] listName3 = (name.split(" "));
        System.out.println(Arrays.toString(listName3));
        Arrays.stream(listName3)
                .filter(x -> x.startsWith("А"))
                .forEach(System.out::println);
    }
}
