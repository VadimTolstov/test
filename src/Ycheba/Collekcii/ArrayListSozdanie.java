package Ycheba.Collekcii;

import java.util.*;

public class ArrayListSozdanie {
    //создание
    ArrayList<String> list1 = new ArrayList<String>();// создание
    ArrayList<String> list2 = new ArrayList<>();// создание как сверху
    ArrayList<String> list3 = new ArrayList<String>(55);//c начальным размером листа
    ArrayList<String> list4 = new ArrayList<String>(list3);// перекладываем данные в лист 4 ссылается на другой объект

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();// создание
        list1.add("Привет");// добавить
        list1.add("Здрасте");// добавить
        list1.add(0, "пока");// добавить на нужный индекс
        System.out.println(list1.get(2));//запросить элемент по индексу
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        list1.set(1, "!!!!!");//заменяем элемент по номеру----------------------------------------------
        System.out.println(list1);

        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("УРА");
        StringBuilder sb2 = new StringBuilder("Как дела?");
        StringBuilder sb3 = new StringBuilder("Добрый день");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");///меняем аррей лист при помощи метода append-------------------------------------
        }
        for (StringBuilder s : list
        ) {
            System.out.print(s + " ");
        }
        System.out.println();

        //удаление поп индексу вернет сам объект---------------------------------------------
        System.out.println("УДАЛИЛ  " + list.remove(2));//удалений по индексу вернет сам объект
        //удаление по значению вернет тру или фолс----------------------------------------------------------------------------------
        System.out.println("УДАЛИЛ  " + list.remove("УРА!!!"));//удалений по имени происходит по equals у Стринг билдера не перезаписан и по этому не удалит
        System.out.println("Можно удалить по объекту -----" + list.remove(sb1));//удалили в стринг билдере объект
        //   list.remove()

        System.out.println("Удаляем в Стринге ---" + list1.remove("пока"));//удаляем т.к equals переопределен в стринге
        System.out.println("Удаляем в Стринге новый объект---" + list1.remove(new String("Здрасте")));//удаляем т.к equals переопределен в стринге

        System.out.println();

        ArrayList<String> list3 = new ArrayList<>();// создание
        list3.add("МЫ");// добавить
        list3.add("Вы");// добавить
        list3.add("Ты");// добавить
        list3.add("Она");// добавить
        list3.add("Машина");// добавить

        ArrayList<String> list4 = new ArrayList<>();// создание
        list4.add("Телегра");// добавить
        list4.add("Верталет");// добавить
        list3.addAll(list4); //добавляем к листу другой лист в конец-------------------------------

        for (String s : list3) {
            System.out.print(s + " ");
        }
        System.out.println();

        list4.addAll(2, list3);// добавляет лист с указанного индекса----------------------------------
        for (String s : list4) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.println("Стринг билдер и его листы \n");

        //у стринг билдора при изменении значения в объекте меняется если прибавить один лист к другому изменится и значения в прибавлином листе
        ArrayList<StringBuilder> listB1 = new ArrayList<>();// создание
        listB1.add(new StringBuilder("МЫ"));// добавить
        listB1.add(new StringBuilder("Вы"));// добавить


        ArrayList<StringBuilder> listB2 = new ArrayList<>();// создание
        listB2.add(new StringBuilder("Телегра"));// добавить
        listB2.add(new StringBuilder("Верталет"));// добавить
        listB1.addAll(listB2); //добавляем к листу другой лист в конец-----------------------------------

        for (StringBuilder s : listB1) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.println("Изменяем параметр в листе\n");
        listB2.get(1).append("!!!");//меняем значения в listB2 и в это время меняется чать которая добавлена в listB1 тк часть в listB1 ссылается на тот же объект который добавили в конец от listB2!!!!!!!!!!!!

        for (StringBuilder s : listB1) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.print("Лист 3 ----> ");
        for (String s : list3) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.println("Выводим индекс найденный первый индекс indexOf ----> " + list3.indexOf(new String("Вы")));//indexOf вернет индекс у String у StringBuilder не найдет и вернет -1 все дело в equals выдается индекс первого совпадения
        System.out.println("Выводим индекс найденный lastIndexOf самый последний индекс искомого объек а ----> " + list3.lastIndexOf(new String("Вы")));// найдет индекс последнего объекта
        System.out.println("\n");

        System.out.println("Выводим длину листа через size ----> " + list3.size());// выводим длину листа ------------------------------
        System.out.println();

        System.out.println("Проверяем пуст лист или нет isEmpty ----> " + list3.isEmpty());// выводит falls если лист не пуст и true если лист пуст--------------------------------
        System.out.println();

        System.out.println("Проверяем если ли такой объект в листе contains ----> " + list3.contains(new String("МЫ")));// выводит falls если такого объекта нет в листе  и true если есть у StringBuilder не найдет в таком виде дело в equals--------------------------------
        System.out.println();

        System.out.println("Выводим объект на экран toString ----> " + list3.toString());//  выводим лист на экран при выводе объекта выведит кракозябру----------------------------
        System.out.println();

        System.out.println("Чистый лист метод clear ---> ");
        list3.clear(); //очищает лист---------------------------------
        for (String s : list3) {
            System.out.print(s);
        }
        System.out.println();

        System.out.println("Клонируем наш лист clone---------> Возвращает Objects");
        StringBuilder Sbb1 = new StringBuilder("A");
        StringBuilder Sbb2 = new StringBuilder("B");
        StringBuilder Sbb3 = new StringBuilder("C");
        ArrayList<StringBuilder> sbbList1 = new ArrayList<>();
        sbbList1.add(Sbb1);
        sbbList1.add(Sbb2);
        sbbList1.add(Sbb3);
        ArrayList<StringBuilder> sbbList2 = (ArrayList<StringBuilder>) sbbList1.clone();//клонируем лист-----------------------------------
        System.out.println("Сравниваем объекты и они должны быть разные ----------> " + (sbbList1 == sbbList2));
        System.out.println("Сравниваем что элементы ссылаются на одни и тежи объекты  ----------> " + (sbbList1.get(0) == sbbList2.get(0)));
        sbbList1.get(0).append("!!!!!!!");
        System.out.println("Проверяем что при изменении в sbbList1.get(0).append(\"!!!!!!!\") изменился и в sbbList2.get(0)-------->  " + sbbList2.get(0));
        sbbList1.set(0, new StringBuilder("D"));
        System.out.println("Но при замени объекта  sbbList1.set(0, new StringBuilder(\"D\")) объект в sbbList2.get(0) останется старым-------->  " + sbbList2.get(0));

        System.out.println();

        StringBuilder Ssb1 = new StringBuilder("A");
        StringBuilder Ssb2 = new StringBuilder("B");
        StringBuilder Ssb3 = new StringBuilder("C");
        ArrayList<StringBuilder> ssbList1 = new ArrayList<>();
        ssbList1.add(Ssb1);
        ssbList1.add(Ssb2);
        ssbList1.add(Ssb3);

        StringBuilder[] array2 = ssbList1.toArray(new StringBuilder[10]);////toArray возвращает новый массив типа данных которые мы указали в параметре ssbList1.toArray(new StringBuilder[10]) -------------------
        for (StringBuilder s : array2
        ) {
            System.out.print(s + " ");

        }
        System.out.println();

        StringBuilder[] array = {Ssb2, Ssb3, Ssb3, Ssb3};
        List<StringBuilder> list8 = Arrays.asList(array);//этот лист будет всегда той же длины, что и массив (длина изменится не может он полностью связан с массивом, когда мы попытаемся заменить сам объект или его внутренность
        //то у этого листа отразится то же самое)------------------------------ -----------------
        System.out.println("Выводим лист -------> " + list8);
        array[0].append("!!!!!");
        System.out.println("Изменяем содержимое массива  array[0].append(\"!!!!!\") ------------> " + list8);//и видим что изменился лист
        array[0] = new StringBuilder("!!!!");
        System.out.println("Заменили элемент array[0] = new StringBuilder(\"!!!!\") ----------> " + list8);//изменили элемент листа, а в методах toArray и clone это не влияет на ново созданный лист
        System.out.println();

        ArrayList<String> l1 = new ArrayList<>();
        String sd1 = "A";
        String sd2 = "B";
        String sd3 = "C";
        String sd4 = "D";
        l1.add(sd3);
        l1.add(sd1);
        l1.add(sd4);
        l1.add(sd2);
        System.out.println("Не сортированный лист " + l1);
        Collections.sort(l1); // sort сортирует коллекцию ----------------------------------------------
        System.out.println("Сортируем лист sort------->>>>>>" + l1);
        System.out.println();

        ArrayList<String> l5 = new ArrayList<>();
        l5.add(sd3);
        l5.add(sd1);
        l5.add(sd4);
        l5.add(sd2);

        ArrayList<String> l2 = l1;
        System.out.println(l1.equals(l2));//сравниваем листы возвращает true или false
        ArrayList<String> l3 = new ArrayList<>();
        l3.add(sd3);
        l3.add(sd1);
        l3.add(sd4);
        l3.add(sd2);
        System.out.println("Метод equals перезаписан и сравнивает нормально порядок элементов  влияет!!!!!!!!!" + l5.equals(l3));//equals перезаписан и сравнивает нормально порядок элементов  влияет!!!!!!!!!
        ArrayList<String> l4 = new ArrayList<>();
        l4.add(sd3);
        l4.add(sd1);
        l4.add(sd4);
        l4.add(sd2);
        l4.add(sd2);
        System.out.println("Метод equals перезаписан и сравнивает нормально порядок элементов  влияет!!!!!!!!!" + l5.equals(l4));//equals перезаписан и сравнивает нормально порядок элементов  влияет!!!!!!!!!
        System.out.println();

//С помощью Iterator мы можем удалять элемент листа, а с помощью форичь нет
        Iterator<String> it = l5.iterator();//сможем пробежаться по элементам листа---------------------
        while (it.hasNext()) {//hasNext есть ли следующий элемент или нет------------да то дальше
            System.out.println(it.next());///next выводит данные на экран----------------
        }
        ListIterator<String> it2 = l5.listIterator();//сможем пробежаться по элементам листа--------------------- работает так же как  Iterator<String> it = l5.iterator();
        while (it2.hasNext()) {//hasNext есть ли следующий элемент или нет------------да то дальше
            it2.next();//выводим элемент-----
            it2.remove();//удаляем элемент листа------------------
        }
    }

}
