package ObjectZoo.Zoo;

public class Dog extends Animal implements Sundable{
    public void print(){
        System.out.println(this);
    }

    @Override
    public void sound() {
        System.out.println("Гав");
    }

    @Override
    public String toString() {
        return "Я класс Собаки";
    }
}

