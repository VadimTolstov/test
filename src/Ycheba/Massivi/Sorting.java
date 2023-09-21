package Ycheba.Massivi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//сортировка массива
public class Sorting {

    public static int[] sorting(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) { //с первого элемента и до последнего производим сравнивание элементов
            int min = array[i];//берем вначале нулевой элемент массива
            int index = i; // берем индекс элемента
            for (int j = i + 1; j < array.length; j++) { // берем джи который будет всегда следующим элементом в массиве
                if (array[j] < min) {//сравниваем элемент j с предыдущим элементом
                    min = array[j]; // при выполнении условия перезаписываем минимум
                    index = j; // и забираем его индекс
                }
            }
            if (i != index) { //сравниваем индекс и индекс нового элемента из условия
                a = array[i];//забираем данные с индекса i
                array[i] = min; //теперь можем перезаписать данные на позиции i
                array[index] = a;// и возвращяем на новое место a
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] is = sorting(new int[]{5, 8, 1, -3, 0, -8, 2, 2});
        for (int i = 0; i < is.length; i++) {
            System.out.println(is[i]);
        }
        ArrayList list = new ArrayList();
        list.add("privet");
    }
}

