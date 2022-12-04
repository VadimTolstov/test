package zadachi.Mashine;

public class Auto {
    private String brand;
    private Engine engine;
    private Wheel wheel;
    private SteeringWheel steeringWheel;
    private Body body;

    public Auto(String brand, String color) {
        this.engine = new Engine();
        this.body = new Body(color);
        this.brand = brand;
        this.wheel = new Wheel();
        this.steeringWheel = new SteeringWheel(this.wheel);
    }

    public void turnRight() {
        steeringWheel.turnRight();
        System.out.println("Машина повернула направо");

    }
}
