package zadachi.nasledovanie.two;

abstract class Mammal extends Animal implements Speakable{

    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void ran();
}
