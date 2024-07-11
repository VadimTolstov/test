package Ycheba.Biblioteci.File.work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
Здесь Сериализация объекта employee в programmer1 и дестирилизация его в  programmer2ю
-все классы объектов должны implements Serializable для стерилизации
- transient поля класса помеченные таким словом не записываются в файл при стерилизации
- В сериализируемом классе необходимо использовать serialVersionUID для обозначения класса.
 */
public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan Tiida", "white");
        Employee employee = new Employee("Mariya", "IT", 29, 500, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
