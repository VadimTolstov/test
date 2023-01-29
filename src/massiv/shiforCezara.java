package massiv;

public class shiforCezara {
    public static String text = "Lorem ipsum is";
    public static String encrypt(String text, int shift) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        char[] encrypted = new char[text.length()];

        while (shift < 0) {
            shift += upper.length();
        }

        for (int i = 0; i < text.length(); i++) {
            if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
                encrypted[i] = upper.charAt((upper.indexOf(text.charAt(i)) + shift) % upper.length());
            } else if ('a' <= text.charAt(i) && text.charAt(i) <= 'z') {
                encrypted[i] = lower.charAt((lower.indexOf(text.charAt(i)) + shift) % lower.length());
            } else {
                encrypted[i] = text.charAt(i);
            }
        }

        return new String(encrypted);
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }

    public static void main(String[] args) {
        System.out.println(encrypt(text, 5));
    }
}

/*
Клод заботится о конфиденциальности, поэтому не хочет, чтобы передаваемую им информацию смогли
перехватить. Но для подстраховки мужчина решил зашифровать свои послания, он будет использовать
для этой цели шифр Цезаря. Вам предстоит написать для него энкриптор (шифровщик) и декриптор (дешифровщик).

Шифр Цезаря работает так: берется каждый символ строки и сдвигается на shift (целое число) вправо.
Так, например, при shift = 5, строка ABC станет FGH, а VWXYZ — ABCDE. Шифруем мы только английский
текст, сохраняя регистр, а знаки препинания и прочие символы, не являющиеся английскими буквами,
оставляем на своих местах.

В классе Main даны сигнатуры двух функций: encrypt и decrypt. Напишите код, реализующий шифрование
и дешифрование с произвольным данным текстом и сдвигом.
⭐ Подумайте, можно ли повторно использовать код одной функции для другой, не копируя его.
 */