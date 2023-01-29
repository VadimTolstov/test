package Ycheba.ForWhile;
// Объявление переменной цикла в самом цикле for
 class ForIVnytri {

    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;
// Вычисление факториала чисел от 1 до 5
        for (int i = 1; i <= 5; i++) {
            sum += i; // переменная i доступна во всем цикле
            fact *= i;
        }
// однако здесь переменная i недоступна
        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}

