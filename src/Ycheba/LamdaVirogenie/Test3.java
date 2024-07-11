package Ycheba.LamdaVirogenie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Test7 {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "poka", "kak dela?", "vse normlano!");
        list.forEach(s -> System.out.println(s));//выводим содержимое листа с помощью лямда выражения


        ArrayList<Integer> al = new ArrayList<>();
        al.add(6);
        al.add(3);
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(7);
        al.add(5);

        al.forEach(el ->{
            System.out.println("Элемент формыч "+el);
            el*=2;
            System.out.println("Элемент  el*=2 "+el);
        });

        //ПЕРВЫЙ ВАРИАНТ
        al.removeIf(element -> element % 3 == 0);//removeIf содержит Predicate в котором  boolean test(T t) возвращяет boolean
        //ВТОРОЙ ВАРИАНТ
        Predicate<Integer> p = element -> element % 3 == 0;
        al.removeIf(p);
        System.out.println(al);
        System.out.println("------------------------------------------------------");
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(6);
        al2.add(3);
        al2.add(2);
        al2.add(4);
        al2.add(1);
        al2.add(7);
        al2.add(5);
        System.out.println(al2);
        al2.sort((x, y) -> x.compareTo(y));//сортировка compareTo сравнивает два аргумента если x<y возвращяет -1 x<y возвращяет 1 x==y возвращяет 0
        System.out.println(al2);
        al2.sort((x, y) -> -x.compareTo(y));//сортировка по убыванию ставим -x.compareTo(y)
        System.out.println(al2);

    }

}
