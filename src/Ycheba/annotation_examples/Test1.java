package Ycheba.annotation_examples;

public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child("Заур");
        p.showInfo();
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated
    void showInfo() {
        System.out.println("Это Parent класс  name = " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("Это Child класс  name = " + name);
    }
}