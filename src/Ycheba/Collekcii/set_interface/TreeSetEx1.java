package Ycheba.Collekcii.set_interface;

import java.util.Set;
import java.util.TreeSet;

/*Хранит значения в отсортированном поярдке

 */
public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(16);
        treeSet.add(7);
        System.out.println(treeSet);
        treeSet.remove(2);
        System.out.println(treeSet);

    }
}
