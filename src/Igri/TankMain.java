package Igri;

public class TankMain {

    public static void main(String[] args) {
/*
Make a Tank(add code to class Tank),
which can move forward and backward
*/

        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.goForward(50);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();

/*
This fragment of code has to output

The Tank is at 10 now.
The Tank is at 60 now.
The Tank is at -40 now.

*/
    }

}


