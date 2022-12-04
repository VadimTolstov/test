package zadachi.Mashine;

public class SteeringWheel {
    private Wheel wheel;

    public SteeringWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void turnRight() {
        System.out.println("Руль повернули направо");
        wheel.turnRight();
    }
}
