package Ycheba.Biblioteci.File.inputOutput.sterilizationDeserialization;


import java.io.*;

/*
https://stepik.org/lesson/721134/step/1?unit=722251
необходимо implements Serializable или добавить конструктор без параметров для того что бы наследника можно было
стерилизовать
Сериализауем User который наследуется от Person
Для Десериализации в класс необходимо добовлять
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\program\\IntelliJIDEA\\Proect\\new\\src\\Ycheba\\Biblioteci\\File\\inputOutput\\sterilizationDeserialization\\users.usr");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        User user = new User("John", "Smith", 25, new Address("Main",33));
        //Сериализация
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(user);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Десериализация
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            User saveUser = (User) objectInputStream.readObject();
            System.out.println(saveUser);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
