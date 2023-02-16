package Ycheba.Metod;
/*Реализуйте код, который печатает на экран случайное целое число в диапазоне от 0 до 10.
Для этого вам понадобится одно умножение и преобразование типов, так как Math.random()
возвращает double, а нам нужен int. Попробуйте решить это задание в одну строчку.*/

class PrivedenieTipov {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 10);
        System.out.println(n);
    }
}
