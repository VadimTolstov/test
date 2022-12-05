package zadachi.Mashine;

public class Wheel {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public void turnRight() {
        System.out.println("Колеса " + name +" поварачиваются на право");
    }

    public void setName(String name) {
        this.name = name;
    }
}
