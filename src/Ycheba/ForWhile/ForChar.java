package Ycheba.ForWhile;


import java.io.IOException;

class ForChar {
    // Выполнение цикла до тех пор, пока с клавиатуры
// не будет введена буква S

    public static void main(String args[]) throws IOException {
        int i;
        System.out.println("Для остановки нажмите клавишу S");
        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Проход #" + i);
    }
}
