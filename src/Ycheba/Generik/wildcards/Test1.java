package Ycheba.Generik.wildcards;

import java.util.ArrayList;
import java.util.List;

class Test1 {
    public static void main(String[] args) {

        List<?> list = new ArrayList<String>();//знак ? означает в джинериках что можно подставить любой класс
        //list.add("Как дела"); нельзя так сделать с <?> т.к компелятор сравнивает тип листа и то что мы добовляем и он не понимает можно добавить в лист который он не знает

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListIngo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Привет");
        list2.add("Пока");
        list2.add("Ок");
        showListIngo(list2);

        //bounded wildcards ограничивать сверху или снизу
        List<? extends Number> list30 = new ArrayList<Integer>();// а так мы пишем что <? может быть сам Number или его дочернии классы
        List<? super Number> list31 = new ArrayList<Number>();// а так мы пишем что <? может быть сам Number или его суперкласс

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(3.48);
        doubleArrayList.add(4.15);
        doubleArrayList.add(6.66);
        System.out.println(summ(doubleArrayList));

        ArrayList<Integer> doubleArrayList1 = new ArrayList<>();
        doubleArrayList1.add(3);
        doubleArrayList1.add(40);
        doubleArrayList1.add(75);
        System.out.println(summ(doubleArrayList1));

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Как дела");
       // System.out.println(summ(stringArrayList)); не даст нам вызвать summ т.к мы его ограничели  Number ->  <? extends Number>

    }

    static void showListIngo(List<?> list) {
        System.out.println("Мой лист содержит следующие элементы: " + list);
    }

    public static double summ(ArrayList<? extends Number> arrayList) {
        double summ = 0;
        for (Number n : arrayList) {
            summ += n.doubleValue();
        } return summ;
    }
}
