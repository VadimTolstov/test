package Ycheba.Biblioteci.File.inputOutput.sterilizationDeserialization;
/*
необходимо implements Serializable или добавить конструктор без параметров для того что бы наследника можно было
стерилизовать
 */

public class Person {
    private String name, lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", lastName='" + lastName + '\'' +
               '}';
    }
}
