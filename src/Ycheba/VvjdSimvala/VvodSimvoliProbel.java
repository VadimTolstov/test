package Ycheba.VvjdSimvala;
// Напишите программу, которая считывает символы с клавиатуры до тех пор,
//пока не встретится точка. Предусмотрите в программе счетчик пробелов.
//Сведения о количестве пробелов должны выводиться в конце программы.

import java.io.IOException;

 class VvodSimvoliProbel {
    public static void main(String[] args) throws IOException {
        char ch;
        int probel = 0;
        System.out.println("Введите точку, что бы остановить цикл.");

        do {
            ch = (char) System.in.read();
            if (ch == ' ') probel++;

        } while (ch != '.');
        System.out.println("Пробелов: " + probel);

    }
}
