package Ycheba.Massivi;

// Пример использования переменной length для копирования массивов

class LengthCopiMassiv {
    public static void main(String args[]) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        for (i = 0; i < nums1.length; i++)
            nums1[i] = i;
// Копирование массива numsl в массив nums2
        if (nums2.length >= nums1.length)//сравнение массивов
            for (i = 0; i < nums2.length; i++)
                nums2[i] = nums1[i]; // копирование массивово

        for (i = 0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
    }
}
