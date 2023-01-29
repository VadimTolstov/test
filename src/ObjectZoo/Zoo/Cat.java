package ObjectZoo.Zoo;

public class Cat extends Animal implements Sundable {
    public void print(){
        System.out.println(this);
    }

    @Override
    public void sound() {
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Я класс Кошка";
    }
}