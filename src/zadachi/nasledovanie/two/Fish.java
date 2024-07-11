package zadachi.nasledovanie.two;

abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("Vsegda interesno nablyubat, kak spyat ribi");
    }

    abstract void swim();
}
