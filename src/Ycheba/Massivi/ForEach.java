package Ycheba.Massivi;

// Использование цикла типа for-each для извлечения массива
class ForEach {

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // Использование цикла типа for-each для
        // суммирования и отображения значений
        for (int x : nums) {  // Цикл типа for-each
       //     for(int i=0; i < 10; i++) sum += nums[i]; тоже самое но без for-each
            System.out.println("Значение: " + x);
            sum += x;
            System.out.println("Сумма: " + sum);
            if (x == 7) break; // прерывание цикла по достижении значения 5
        }
    }

}
