package Igri;

public class TanksToplivom {
    public static void main(String[] args) {
/*
Make (add code to class Tank),
with fuel and different constructors
*/

        // At (0;0) fuel=100
        TankToplivo justTank = new TankToplivo();
        // At (10;10) fuel=100
        TankToplivo anywareTank = new TankToplivo(10, 10);
        // At (20;30) fuel=200
        TankToplivo customTank = new TankToplivo(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

/*
This fragment of code has to output

The Tank is at 100, 0 now.
The Tank is at 110, 10 now.
The Tank is at 220, 30 now.

*/
    }
}
