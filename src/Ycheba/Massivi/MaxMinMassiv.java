package Ycheba.Massivi;

// Поиск минимального и максимального значений в массиве
class MaxMinMassiv {
    public static void main(String args[]) {
        int nums[] = new int[10];//инициализация массива
      //  int nums[] = { 99, -10, 100123, 18, -978, 5623, 4 63, -9, 287, 49 }; инициализация массива
        int min, max;
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
      /*  for (int v : nums) {      переписаный for-each верхнее условие
            if (v < min) min = v;
            if (v > max) max = v;
        }                                      */
        System.out.println("min и max: " + min + " " + max);
    }
}