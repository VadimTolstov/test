package Ycheba.String;

/*Напишем метод, который принимает строку и проверяет, заглавная ли первая буква. Алгоритм действий будет такой:

Получим и запишем в переменную первый символ из строки-аргумента
Сравним, равен ли символ своей заглавной версии
Вернем результат

 */

public class SravniPerviSimvol {
    public static void main(String[] args) {


        System.out.println(SravniPerviSimvol.isFirstLetterInUpperCase("marmont")); // false
        System.out.println(SravniPerviSimvol.isFirstLetterInUpperCase("Robb")); // true
    }

    public static boolean isFirstLetterInUpperCase(String string) {
        var firstLetter = string.charAt(0);
        // Класс Character содержит различные методы для работы с символом
        // Метод isUpperCase() проверяет, что переданный символ в верхнем регистре
        return Character.isUpperCase(firstLetter);
    }


}