package Ycheba.VvjdSimvala;

import java.io.IOException;

//Коды ASCII-символов нижнего регистра отличаются от кодов соответствующих символов верхнего регистра на величину 32.
// Следовательно, для преобразования строчной буквы в прописную нужно уменьшить ее код на
//32. Используйте это обстоятельство для написания программы, читающей
//символы с клавиатуры. При выводе результатов данная программа должна
//преобразовывать строчные буквы в прописные, а прописные — в строчные.
//Остальные символы не должны меняться. Работа программы должна завершаться после того, как пользователь введет с клавиатуры точку. И наконец,
//сделайте так, чтобы программа отображала количество символов, для которых был изменен регистр.
//// Смена регистра символов

 class VvodSimvolovRegistr {
    public static void main(String[] args) throws IOException {
        char ch;
        int registr = 0;
        System.out.println("Для остановки введите символ точки.");
        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                registr++;
                System.out.println(ch);
            } else if (ch >= 'A' & ch < 'Z') {
                ch += 32;
                registr++;
                System.out.println(ch);
            }

        } while (ch != '.');
        System.out.println("Измененные регистра: " + registr);
    }

}

