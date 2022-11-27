package Igri;

public class Tank90grad {
    public static void main(String[] args) {
/*Реализуйте повороты танка на 90°, чтобы он мог перемещаться по всей плоскости, вот так: танк смотрит
на право по умолчанию, у смотрить в низ (+ направление)
Make (add code to class Tank),
which can turn around
*/
        Tank90 tank = new Tank90();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();

/*
This fragment of code has to output

The Tank is at 10, 0 now.
The Tank is at 10, 50 now.
The Tank is at -90, 50 now.

*/
    }

}


