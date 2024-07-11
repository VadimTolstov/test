package Ycheba.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/*
list.stream().reduce((accumulator, element) //accumulator - это то что накапливает
 */

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
// reduce возвращает Optional и по этому мы используем в конце .get(); что бы получить значение
        int result = list.stream().reduce((accumulator, element) //accumulator - это то что накапливает и ему сразу присватывается первый элемент потока
                -> accumulator * element).get();                   //затем второй элемент потока передается element и далие выполняется действие accumulator*element
        System.out.println(result);                             //и далее accumulator хранит решение и дальше element присваивается следущее значени и умнажает на accumulator


        List<Integer> list100 = new ArrayList<>();
        //можно написать так но если лист будет пустым выпадит исключение
//        int result100 = list100.stream().reduce((accumulator, element)
//                -> accumulator*element).get();
        //лучше так так проверяет что лист не пуст
        Optional<Integer> o = list100.stream().reduce((accumulator, element) ->
                accumulator * element);
        if (o.isPresent()) {//o.isPresent() o не пуст
            System.out.println(o.get());
        } else {
            System.out.println("Not present");
        }
////у такого написане есть свой плюс мы не получим ошибку т.к как минимум один элемент будет уже в листе 1 - .reduce(1,(accumulator, element)
        int result2 = list.stream().reduce(1, (accumulator, element) //accumulator в данном случаи принимает первое значение 1 .reduce(1,(
                -> accumulator * element);                   //затем второй элемент потока передается element и далие выполняется действие accumulator*element
        System.out.println(result2);                             //и далее accumulator хранит решение и дальше element присваивается следущее значени и умнажает на accumulator

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("OK");
        list3.add("poka");

        String result3 = list3.stream().reduce((a, e) ->
                a + " " + e).get();
        System.out.println(result3);
    }
}
