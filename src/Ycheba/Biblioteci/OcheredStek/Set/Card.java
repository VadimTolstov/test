package Ycheba.Biblioteci.OcheredStek.Set;

import java.util.Objects;

/*Создайте класс Card (Карта) с полями «масть» типа String и «ранг» типа String.
Определите в нем методы equals() и hashCode() (подумайте, какие лучше поля включить в оба метода).
Создайте HashSet, заполните его полностью колодой карт от 6 до туза, плюс еще 3-4 повторяющиеся карты.
Убедитесь, что длина Set в итоге после добавления карт = 36.

 */
class Card {
    private final String mast;
    private final String rang;

    public Card(String mast, String rang) {
        if (mast == null || rang == null){
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        this.mast = mast;
        this.rang = rang;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return mast.equals(card.mast) && rang.equals(card.rang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mast, rang);
    }
}
