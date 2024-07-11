package Ycheba.Collekcii.Comparatori.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Сортировка листа */
public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Mariya");
        System.out.println("Перед сортировкой ");
        System.out.println(list);
        System.out.println("После сортировки ");
        Collections.sort(list);
        System.out.println(list);
    }
}
