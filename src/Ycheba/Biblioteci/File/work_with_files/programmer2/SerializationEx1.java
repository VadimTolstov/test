package Ycheba.Biblioteci.File.work_with_files.programmer2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Сериализация - это процесс преобразования объектов в последовательность байт.
Десериализация - это процесс востановления объекта, из этих байт.
Здесь в пакете programmer2 мы Десериализуем данные, в пакете programmer1 Сериализуем данные
 */
public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"))

        ) {
            employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
