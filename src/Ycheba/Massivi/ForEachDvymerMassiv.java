package Ycheba.Massivi;

class ForEachDvymerMassiv {
    // Использование расширенного цикла for
    // для обработки двумерного массива

    public static void main(String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];
        // Ввод ряда значений в массив nums
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);
        // Использование цикла типа for-each для
        // суммирования и отображения значений.
        for (int х[] : nums) { //Обратите внимание на способ объявления переменной х
            for (int у : х) {
                System.out.println("Значение: " + у);
                sum += у;
            }
        }
        System.out.println("Сумма: " + sum);

    }
}