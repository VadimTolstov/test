package Ycheba.Collekcii.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapex {
    public static void main(String[] args) {
    //    LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, false); //false значит отображаться будет в том парядке как добавили
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true); //true значит последний элемент который использовали встанет в листе на последнее место lhm.get(7.5)
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);

        lhm.put(7.2, st3);
        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        lhm.put(7.5, st4);
        System.out.println(lhm);

        System.out.println(lhm.get(6.4));//переместица сначало на последнее а после исользования lhm.get(7.5) на предпоследнее место в листе
        System.out.println(lhm.get(7.5));//переместица на последнее место в листе
        System.out.println(lhm);
    }
}
