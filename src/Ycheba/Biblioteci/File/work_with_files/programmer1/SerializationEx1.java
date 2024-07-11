package Ycheba.Biblioteci.File.work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
Сериализация - это процесс преобразования объектов в последовательность байт.
Десериализация - это процесс востановления объекта, из этих байт.
Здесь в пакете programmer1 мы Сериализуем данные, в пакете programmer2 Десериализуем данные
 */
public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Zaur");
        employees.add("Ivan");
        employees.add("Elena");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees1.bin")
        )

        ) {
            outputStream.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
