package zadachi.nasledovanie.two;

class Main {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Джамшут");
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();

        Speakable pingvin = new Pingvin("Lavash");
        pingvin.speak();

        Animal lev = new Lev("Feda");
        lev.eat();
        lev.sleep();

        Mammal lev2 = new Lev("Feda2");
        lev2.ran();
        lev2.eat();
        lev2.sleep();
        lev2.speak();
    }
}
