package Ycheba.Collekcii.set_interface;

import java.util.HashSet;
import java.util.Set;

//у Set нет get
public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");

        System.out.println(set);

        set.remove("Zaur");

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("size " + set.size());
        System.out.println("isEmpty " + set.isEmpty());
        System.out.println("contains " + set.contains("Marina"));
    }
}
