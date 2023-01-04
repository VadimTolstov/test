package Ycheba.ForWhile;

public class ForiIf {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if ((i % 2) == 0) continue; // срабатывает когда появляются четные числа, возращяется к циклу
            System.out.println();   // срабатывает на нечетных цифрах

        }
    }
}
