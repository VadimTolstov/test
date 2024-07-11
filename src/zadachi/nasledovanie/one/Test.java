package zadachi.nasledovanie.one;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Lada");
        System.out.println("Количество лам Dog " + dog.paw);
        Cat cat = new Cat("Irma");
        cat.sleep();
    }
}
