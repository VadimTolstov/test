package regylarViragenia;

import java.util.regex.Pattern;

public class RazborTextaMassiv {
    public static void main(String[] args) {
        String text = "Егор Алла Анна";
        Pattern pattern = Pattern.compile("\\s");
        String[] strings = pattern.split(text,2);
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("---------");
        String[] strings1 = pattern.split(text);
        for (String s : strings1) {
            System.out.println(s);
        }
    }
}
/*
String[] split(CharSequence text, int limit) – разбивает текст,
переданный в качестве параметра на массив элементов String.
Параметр limit определяет предельное количество совпадений, которое ищется в тексте:
при limit>0 – выполняется поиск limit-1 совпадений;
при limit<0 – выполняется поиск всех совпадений в тексте
при limit=0 – выполняется поиск всех совпадений в тексте,
при этом пустые строки в конце массива отбрасываются;
 */