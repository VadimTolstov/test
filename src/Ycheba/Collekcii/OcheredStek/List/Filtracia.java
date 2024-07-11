package Ycheba.Collekcii.OcheredStek.List;


import java.util.LinkedList;
import java.util.List;

class Filtracia {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        //Заполняем лист(массив)
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        //выводим наполненый массив
        System.out.println(list);

        //будем переписывать массив
        for (int i = 0, j = 99; i < 50 && j >= 50; i++, j--) {
            //определяем расположение и значения в массиве
            int start = list.get(i);
            int end = list.get(j);
            //переписываем заменой значения в массиве
            list.set(j, start);
            list.set(i, end);
        }

        System.out.println(list);
    }
}
