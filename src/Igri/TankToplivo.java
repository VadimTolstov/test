package Igri;

public class TankToplivo {

    static final String MODEL = "Т34";
    static int ntanks;
    private int x, y;
    private int dir;
    // Добавьте в класс поле int fuel.
    private int n;
    private int fuel;

    public TankToplivo() {
        this.fuel = 100;
        n = ++ntanks;
    }

    public TankToplivo(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
        n = ++ntanks;
    }

    public TankToplivo(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++ntanks;

    }

    // Топливо должно уменьшаться на единицы пройденного расстояния,
    // и Танк должен проезжать не больше единиц расстояния, ч
    // ем остаток топлива.
    public void goForward(int i) {
        if (i > fuel) {
            i = fuel;
        } //проверка топлива
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
    }
    /* тоже самое что выше
    public void goForward(int i) {
        if (i < 0 && -i > -fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
    }
    */

    public void printPosition() {
        System.out.println("The Tank " + MODEL +"-"+ n +" is at "+ x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }

}
