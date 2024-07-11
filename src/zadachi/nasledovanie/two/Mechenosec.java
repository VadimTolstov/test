package zadachi.nasledovanie.two;

class Mechenosec extends Fish{
    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Меченосиц не кушает руб, а ест обычный рыбий корм");
    }

    @Override
    void swim() {
        System.out.println("Меченосиц красивая рыба");
    }
}
