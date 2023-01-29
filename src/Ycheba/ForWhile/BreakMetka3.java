package Ycheba.ForWhile;

class BreakMetka3 {
    // Расположение метки имеет большое значение

    public static void main(String args[]) {
        int x = 0, y = 0;
// Здесь метка располагается перед циклом for
        stopl:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stopl;
                System.out.println("x и у: " + x + " " + y);
            }
        }
        System.out.println();
// А тут метка располагается непосредственно перед
// открывающей фигурной скобкой
        for (x = 0; x < 5; x++)
            stop2:{
                for (y = 0; y < 5; y++) {
                    if (y == 2) break stop2;
                    System.out.println("x и у: " + x + " " + y);


                }
            }
    }
}
