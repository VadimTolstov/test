package Ycheba.ForWhile;

import java.io.IOException;

class DoWhile {
    public static void main(String args[]) throws IOException {
        char ch, ignore, answer = 'K';
        do {
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.print("Попытайтесь ее угадать: ");
// Получение символа с клавиатуры
            ch = (char) System.in.read();
// Отбрасывание всех остальных символов во входном буфере
           do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print("...Извините, нужная буква находится ");
                if (ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        } while (answer != ch);
    }
}
//Как пояснялось ранее, консольный ввод буферизуется построчно, т.е. для
//передачи символов, вводимых с клавиатуры, приходится нажимать клавишу
//<Enter>, что приводит к формированию последовательности символов перевода
//строки и возврата каретки. Эти символы сохраняются во входном буфере вместе
//с символами, введенными с клавиатуры. Кроме того, если ввести с клавиатуры
//несколько символов подряд, не нажав клавишу <Enter>, то они так и останутся
//во входном буфере. Но это не точно похоже описана старая версия Java