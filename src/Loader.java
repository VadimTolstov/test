public class Loader {
    public static void main(String[] args) {
        int a = 10;
        while (a > 0) {
            a--;
            System.out.println(a+ " Переменная А");
            if (a == 5)
                break;
        }
        int summ = 0;
        for (int i =0; i < 50; i += 1) {
            if (i ==45)
                continue;
            System.out.println(i+ " Переменная И");
            summ += i;
            System.out.println(summ+ " Переменная Сумма");
        }
        switch (summ){
            case 50:
                System.out.println("50");
                break;
            case 1180:
                System.out.println("1180");
                break;
            case 1225:
                System.out.println("1225");
                break;
            default:
                System.out.println("Результат не верный.");
        }
        if (a == 5 && summ== 1180)
            System.out.println("Условие выполнено");
        else System.out.println("Условие не выполнено");

    }
}
/* Создать класс Loader с методом public static void main, в котором реализуются следующие задачи:

        Объявить целочисленную переменную a, инициализировать значением 10.
        Создать цикл while, который должен выполняться, пока a больше нуля, при каждом шаге a уменьшается на 1.
        При значении a, равном 5, реализовать выход из цикла.
        Объявить целочисленную переменную summ, инициализировать значением 0.
        Реализовать цикл for с итерационной переменной i, равной нулю. Цикл должен выполняться, пока i меньше 50, с каждым шагом i увеличивается на единицу.
        С каждым шагом цикла увеличивать значение summ на i. При значении i, равном 45, пропустить итерацию.
        Создать switch с проверкой summ, со следующими условиями:
        при summ, равной 50, вывести значение 50;
        при summ, равной 1180, вывести значение 1180;
        при summ, равной 1225, вывести значение 1225;
        во всех остальных случаях "Результат неверный".
        8. Проверить условие: если а равно 5 и summ равно 1180, вывести на экран "Условие выполнено", иначе — "Условие не выполнено".

        Решением задачи является вывод на экран "Условие выполнено".

 */