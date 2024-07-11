package Ycheba.Biblioteci.File.inputOutput.sterilizationDeserialization;

import java.io.Serial;
import java.io.Serializable;

/*
необходимо implements Serializable или добавить конструктор без параметров для того что бы наследника можно было
стерилизовать
 */

public class User extends Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -7140749638401553132L;
    private int age;
    private transient Address address;

    public User(String name, String lastName, int age, Address address) {
        super(name, lastName);
        this.age = age;
        this.address = address;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + getName() +
               ", lestName=" + getLastName() +
               ", age=" + age +
               ", address=" + address +
               '}';
    }
}
