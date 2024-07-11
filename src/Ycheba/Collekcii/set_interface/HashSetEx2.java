package Ycheba.Collekcii.set_interface;

import java.util.HashSet;

/*      HashSet<Integer> union = new HashSet<>(hashSet1);//добавили в сет первый элемент
union.addAll(hashSet2);//объединили все элементы без повторения

intersect.retainAll(hashSet2)//отставили только те элементы которые есть в обоих сетах

 subtract.removeAll(hashSet2);//удали из первого сета все элементы второго сета
 */
public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(7);
        hashSet1.add(3);
        hashSet1.add(10);
        hashSet1.add(2);
        System.out.println("hashSet1 " + hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);
        System.out.println("hashSet2 " + hashSet2);

        HashSet<Integer> union = new HashSet<>(hashSet1);//добавили в сет первый элемент
        union.addAll(hashSet2);//объединили все
        System.out.println("addAll " + union);

        HashSet<Integer> intersect = new HashSet<>(hashSet1);//добавили в сет первый элемент
        intersect.retainAll(hashSet2);//отставили только те элементы которые есть в обоих сетах
        System.out.println("retainAll " + intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet1);//добавили в сет первый элемент
        subtract.removeAll(hashSet2);//удали из первого сета все элементы второго сета
        System.out.println("subtract " + subtract);

    }
}
