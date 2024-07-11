package Ycheba.Collekcii.list_interface;

import java.util.*;

//add("Привет"); добавить
//size()); выводим длину листа
//append("!!!"); меняем аррей лист у StringBuilder при помощи метода append------
//addAll(listB2); //добавляем к листу другой лист в конец-----------------------------------
//addAll(2, list3);// добавляет лист с указанного индекса----
//indexOf(new String("Вы")));//indexOf вернет индекс у String у StringBuilder не найдет и вернет -1 все дело в equals выдается индекс первого совпадения
//lastIndexOf(new String("Вы")));// найдет индекс последнего объекта
//isEmpty());// выводит falls если лист не пуст и true если лист пуст----
//contains(new String("МЫ")));// выводит falls если такого объекта нет в листе  и true если есть у StringBuilder не найдет в таком виде дело в equals-----------------
//clear(); //очищает лист---
//clone();//клонируем лист----
//toArray(new StringBuilder[10]);////toArray возвращает новый массив типа данных которые мы указали в параметре ssbList1.toArray(new StringBuilder[10]) -----
//sort(l1); // sort сортирует коллекцию -----
//(l1.equals(l2));//сравниваем листы возвращает true или false
//iterator();//сможем пробежаться по элементам листа---
//listIterator();//сможем пробежаться по элементам листа--------------------- работает так же как  Iterator<String> it = l5.iterator();
//.hasNext()) {//hasNext есть ли следующий элемент или нет------------да то дальше
//.next();//выводим элемент--------
//.remove();//удаляем элемент листа--
// al1.removeAll(al2);//removeAll удалит с al1 все элементы которые есть в al2 и al1--
// al3.retainAll(al2);//retainAll удалит с al3 все элементы которых нет в al1 и al2---
// boolean result = al1.contains(al2);//result содержит ли al1 все элементы al2 вернет false если не содержит и true если содержит-----
// Arrays.asList(array);//этот лист будет всегда той же длины, что и массив (длина изменится не может он полностью связан с массивом, когда мы попытаемся заменить сам объект или его внутренность
//subList(1, 4);//subList возвращает отрывок уже List (я хочу что бы элементы с 1-го по 4 не включительно можно было увидеть ArrayList с помощью представления subList
//List.of("odin", "dva", "tri");//этот лист нельзя изменить не могут содержать null------
//List.copyOf(al1);//копируем лист не могут содержать null -----


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
        list1.add(0, "пока");// добавить на нужный индекс----------------------------
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
        list4.add("Телега");// добавить
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
            it2.next();//выводим элемент-----------------------------------------------------------------------
            it2.remove();//удаляем элемент листа--------------------------------------------------------------------------------------------------
        }
    }

}

class Test2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4,};

        char[] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array4 = {'p', 'r', 'i', 'v', 'e', 'v', 'k', 'a'};
        char[] array5 = null;

        System.out.println(Arrays.compare(array1, array2)); // когда compare сравнивает массивы если 1 больше второго возвращает  1 если меньше -1 равны 0
        System.out.println(Arrays.compare(array3, array4)); // когда compare сравнивает массивы если 1 больше второго возвращает  1 если меньше -2 равны 0
        System.out.println(Arrays.compare(array3, array5)); // когда compare сравнивает c null то null всегда меньше


        //mismatch находит первый индекс расхождения
        System.out.println(Arrays.mismatch(array2, array1));// mismatch вернет индекс первого расхождения (с какокого индекса они перестают быть одинаковы
        System.out.println(Arrays.mismatch(array3, array4)); // так же и для char
    }
}

class Test1 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("all = " + al1);

        ArrayList<String> al3 = new ArrayList<>();
        al3.add("one");
        al3.add("two");
        al3.add("three");
        al3.add("four");
        al3.add("five");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("one");
        al2.add("three");
        al2.add("four");
        al2.add("ten");

        al1.removeAll(al2);//removeAll удалит с al1 все элементы которые есть в al2 и al1----------------------------
        System.out.println("al1  removeAll = " + al1);

        al3.retainAll(al2);//retainAll удалит с al3 все элементы которых нет в al1 и al2---------------------------------------------------
        System.out.println("al3 retainAll = " + al3);

        boolean result = al1.contains(al2);//result содержит ли al1 все элементы al2 вернет false если не содержит и true если содержит------------
        System.out.println("result = " + result);

        boolean result2 = al1.containsAll(al2);//result содержит ли al1 все элементы al2 вернет false если не содержит и true если содержит------------
        System.out.println("result2 = " + result2);

        ArrayList<String> al4 = new ArrayList<>();
        al4.add("one");
        al4.add("two");
        al4.add("three");
        al4.add("four");
        al4.add("five");
        System.out.println("al4 = " + al4);

        List<String> subList = al4.subList(1, 4);//subList возвращает отрывок уже List (я хочу что бы элементы с 1-го по 4 не включительно можно было увидеть ArrayList с помощью представления subList
        System.out.println("subList = " + subList);
        subList.add("zen");// добавляем в subList новую запись -----> но в обратную сторону не работает - выдаст ошибку
        System.out.println("al4 = " + al4); // видим что запись добавилась и в al4
        System.out.println("subList = " + subList);// наш subList это представления al4 а именно его элементов

        ArrayList<String> al5 = new ArrayList<>();
        al5.add("one");
        al5.add("two");
        al5.add("three");
        al5.add("four");
        al5.add("five");
        String[] array = al5.toArray(new String[15]);
        System.out.print("array = ");
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}

class Test3ListOf {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        List<String> list = List.of("odin", "dva", "tri");//этот лист нельзя изменить не могут содержать null----------------
        System.out.println("list = " + list);

        List<String> list2 = List.copyOf(al1);//копируем лист не могут содержать null -------------------
        System.out.println("list2 = " + list2);
    }
}

class Test4 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();//плохо писать без <> типа безопасность
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        for (Object o : al1) {
            System.out.println("Number = " + o + " and length = " + ((String) o).length());
        }
    }
}

class Test5Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mikhail");//добавляем элемент----------
        map.put(778, "Tregulov Zaur");
        map.put(779, "Sidorova Mariya");
        map.put(780, "Petrov Petr");
        map.put(777, "Roberto Karlos"); //перезатрет запись с таким же ключом
        map.remove(779);//удаляем элемент-----------------------------------------------------------------------------
        System.out.println("map = " + map);
    }

}

class Test6Metod {
    /*Метод возвращает отсортированный ArrayList без повторений*/
    public static void main(String[] args) {
        Test6Metod test6Metod = new Test6Metod();
        test6Metod.abs("раз", "два", "два", "раз", "привет");
        test6Metod.abs2("Привет", "Пока", "Привет", "Как дела", "Пока");
    }

    public ArrayList<String> abs(String... strings) {
        Set<String> setList = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for (String string : strings) {
            setList.add(string);
            list = new ArrayList<>(setList.stream()
                    .map(String::new)
                    .toList());
            Collections.sort(list);
        }

        System.out.println(list);
        return list;

    }

    //тоже самое что abs
    public ArrayList<String> abs2(String... strings) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }
}
