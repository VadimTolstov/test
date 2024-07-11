package Ycheba.Generik.practica;

public abstract class Animal {

    private String name;
    private String view;
    private int age;

    public Animal(String name, String view, int age) {
        this.name = name;
        this.view = view;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getView() {
        return view;
    }

    public int getAge() {
        return age;
    }
}
