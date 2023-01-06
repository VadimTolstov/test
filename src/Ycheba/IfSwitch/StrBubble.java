package Ycheba.IfSwitch;


//Сортировка Стокового массива пузырьковым методом
class StrBubble {
    public static void main(String args[]) {
        String strs[] = {"this", "is", "a", "test", "of", "a", "string", "sort"};
        int a, b;
        int size = strs.length;// количество сортируемых элементов
        String t;

        // Отображение исходного массив
        System.out.println("Исходный массив: ");
        for (String x : strs)
            System.out.print(x + " ");
        System.out.println();

        // Реализация алгоритма пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (strs[b - 1].compareTo(strs[b]) > 0){ // если требуемый порядок
                                                        // следования не соблюдается,
                                                        // поменять элементы местами
                    t=strs[b-1];
                    strs[b-1]=strs[b];
                    strs[b]=t;
                }
            }
        // Отображение отсортированного массива
        System.out.print("Отсортированный массив:");
        for(int i=0; i < size; i++)   //тоже самое что ниже
            System.out.print(" " + strs[i]);

     //   for (String z: strs)    //тоже самое что выше
      //      System.out.print(" "+z);
        System.out.println();


    }
}