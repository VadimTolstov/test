package Igri;

public class Tank90 {
    int x, y;
    int dir;

    //мы считаем, что dir может принимать 4 значения
    //0 (значение по умолчанию) вправо
    //1  - вниз, 2  - влево, 3 - вверх
    public void goForward(int i) {
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;

    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;

    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x +","+ y+" now.");
    }


    public void goBackward(int i) {
        goForward(-i);
    }
}
