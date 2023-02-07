package Ycheba.Biblioteci.OcheredStek.Set;

import java.util.HashSet;
import java.util.Set;

/*Создайте класс Card (Карта) с полями «масть» типа String и «ранг» типа String.
Определите в нем методы equals() и hashCode() (подумайте, какие лучше поля включить в оба метода).
Создайте HashSet, заполните его полностью колодой карт от 6 до туза, плюс еще 3-4 повторяющиеся карты.
Убедитесь, что длина Set в итоге после добавления карт = 36.
 */

class CardMain {
    public static void main(String[] args) {
        Set<Card> set = new HashSet<>();

        //черви
        set.add(new Card("6", "черви"));
        set.add(new Card("7", "черви"));
        set.add(new Card("8", "черви"));
        set.add(new Card("9", "черви"));
        set.add(new Card("10", "черви"));
        set.add(new Card("Валет", "черви"));
        set.add(new Card("Дама", "черви"));
        set.add(new Card("Король", "черви"));
        set.add(new Card("Туз", "черви"));

        //бубны
        set.add(new Card("6", "бубны"));
        set.add(new Card("7", "бубны"));
        set.add(new Card("8", "бубны"));
        set.add(new Card("9", "бубны"));
        set.add(new Card("10", "бубны"));
        set.add(new Card("Валет", "бубны"));
        set.add(new Card("Дама", "бубны"));
        set.add(new Card("Король", "бубны"));
        set.add(new Card("Туз", "бубны"));

        //крести
        set.add(new Card("6", "крести"));
        set.add(new Card("7", "крести"));
        set.add(new Card("8", "крести"));
        set.add(new Card("9", "крести"));
        set.add(new Card("10", "крести"));
        set.add(new Card("Валет", "крести"));
        set.add(new Card("Дама", "крести"));
        set.add(new Card("Король", "крести"));
        set.add(new Card("Туз", "крести"));

        //пики
        set.add(new Card("6", "пики"));
        set.add(new Card("7", "пики"));
        set.add(new Card("8", "пики"));
        set.add(new Card("9", "пики"));
        set.add(new Card("10", "пики"));
        set.add(new Card("Валет", "пики"));
        set.add(new Card("Дама", "пики"));
        set.add(new Card("Король", "пики"));
        set.add(new Card("Туз", "пики"));

        // добавим лишние карты в полную колоду
        set.add(new Card("8", "пики"));
        set.add(new Card("Валет", "бубны"));
        set.add(new Card("Дама", "черви"));
        set.add(new Card("Туз", "крести"));

        System.out.println(set.size());



    }
}
