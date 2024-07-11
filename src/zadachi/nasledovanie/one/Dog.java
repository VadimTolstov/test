package zadachi.nasledovanie.one;

public class Dog extends Pet {

    public Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    }

    public void pay() {
        System.out.println("Dog plays");
    }
}
