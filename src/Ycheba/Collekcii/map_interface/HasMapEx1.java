package Ycheba.Collekcii.map_interface;

import java.util.HashMap;
import java.util.Map;

//Можем добавить null как ключ или значение, если ключ повторится то перетрет значение предыдущего ключа
//.put(1000, "Zaur Tregulov") добавить значение в лист
//.putIfAbsent(1000, "Oleg Ivanov") означает добавь если такого значения ключа еще нет
//.get(1000) найти значения по ключу
//.remove(15879) удалить по ключу если ключа нет вернет null
//.containsValue("Ivan Ivanov") вернет true если такое значение есть
//.containsKey(3568) вернет true если такой ключ есть
//.keySet() возвращяет ключи которые есть в колекции
//.values() возвращяет значение которые есть в листе
//.entrySet() можно выводить ключь и значения при помощи цикла
public class HasMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");//-----------------------------
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.put(1000, "Oleg Ivanov");// перетрем "Zaur Tregulov"--------------
        // map1.put(null, "Sergey Petrov"); хранит null
        // map1.put(8514, null);
        map1.putIfAbsent(3568, "Vadim Sidorov");//------------------------------
        System.out.println("putIfAbsent(3568, \"Vadim Sidorov\") " + map1);
        System.out.println(".containsValue(\"Ivan Ivanov\") " + map1.containsValue("Ivan Ivanov"));//-------------
        System.out.println(".containsKey(3568) " + map1.containsKey(3568));//-------------
        System.out.println("get(1000) " + map1.get(1000));//---------------
        map1.remove(15879);
        System.out.println("remove(15879) " + map1);//--------------------
        System.out.println(map1.keySet());//------------------
        System.out.println(map1.values());//------------------
        for (Map.Entry<Integer, String> entry: map1.entrySet()){
            System.out.println("Выводи при помощи map1.entrySet() "+entry.getKey() + ":" + entry.getValue());
        }
    }
}
