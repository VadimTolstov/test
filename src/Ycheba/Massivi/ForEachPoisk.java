package Ycheba.Massivi;

// Поиск в массиве с использованием расширенного цикла for

class ForEachPoisk {
    public static void main(String args[]) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
// Использование цикла типа for-each для поиска
// значения переменной val в массиве nums
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;

            }
        }
        if (found)
            System.out.println("Значение найдено!");

    }
}