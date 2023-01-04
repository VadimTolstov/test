package Ycheba.ForWhile;

class ForBezTela {
    // Пропуск отдельных составляющих в определении цикла for

    public static void main(String args[]) {
        int i;  // Выносим инициализацию за пределы цикла инициализирующее
        int sum = 0;
        // суммируются числа от 1 до 5
        for (i = 1; i <= 5; sum += i++) ;// равняется sum = sum + i; i++;
        System.out.println("Сумма: " + sum);


    }
}
