package zadachi.nasledovanie.two;

class Lev extends Mammal {
    public Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Лев любит мясо");
    }

    @Override
    void sleep() {
        System.out.println("Лев всегда щимит");
    }

    @Override
    void ran() {
        System.out.println("Лев бегает как ведро");
    }
}
