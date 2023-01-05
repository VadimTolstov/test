package Ycheba.Massivi;

// Присваивание ссылок на массивы меняет оба массива
public class PrisvoenSsilokMassiv {
    public static void main(String args[]) {
        int i;
        int numsl[] = new int[10];
        int nums2[] = new int[10];
        for (i = 0; i < 10; i++)
            numsl[i] = i;
        for (i = 0; i < 10; i++)
            nums2[i] = -i;
        System.out.print("Массив numsl: ");
        for (i = 0; i < 10; i++)
            System.out.print(numsl[i] + " ");
        System.out.println();
        System.out.print("Массив nums2: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();
        nums2 = numsl; // теперь обе переменные ссылаются на
                        // массив numsl
        System.out.print("Массив nums2 после присваивания: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();
                // Выполнение операций над массивом numsl
                // через переменную nums2
        nums2[3] = 99;
        System.out.print("Массив numsl после изменения через nums2: ");
        for (i = 0; i < 10; i++)
            System.out.print(numsl[i] + " ");
        System.out.println();

    }
}
