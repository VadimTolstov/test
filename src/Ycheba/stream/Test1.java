package Ycheba.stream;

import java.util.*;
import java.util.stream.Collectors;

/*
map() - берет по очереди каждый элемент из нашего stream и сопоставляют ему элемент который из него получается после применения
на нем тех действий которые мы описываем в нутри мепа с помощью лямда выражения
collect( Collectors.toList()) - преабразует поток в лист
.toArray() - преобразует потом в массив

любой поток можем потом преобразовать в лист массив или сетлист и тд

 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);

        Set<Integer> collect = set.stream().map(element -> element.length()).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
