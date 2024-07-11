package Ycheba.Biblioteci.File.inputOutput.sterilizationDeserialization.dz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDz {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Поля", "Абиссинская", 3.5));
        cats.add(new Cat("Толя", "Анатолийская", 5.0));
        cats.add(new Cat("Петя", "Бомбейская", 2.9));
        cats.add(new Cat("Барсик", "Британская длинношёрстная", 4.1));
        cats.add(new Cat("Мурка", "Бурма", 3.8));
        cats.add(new Cat("Самса", "Гавана", 4.5));
        cats.add(new Cat("Чебурек", "Домашняя", 2.8));
        cats.add(new Cat("Беляш", "Девон рекс", 3.5));

        File file = new File("D:\\program\\IntelliJIDEA\\Proect\\new\\src\\Ycheba\\Biblioteci\\File\\inputOutput\\sterilizationDeserialization\\dz\\cats.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
           e.printStackTrace();
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(cats);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            List<Cat> listCats = (ArrayList<Cat>) objectInputStream.readObject();
           for(Cat cat: listCats){
               System.out.println(cat.getName());
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
