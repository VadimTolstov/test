package Ycheba.Collekcii.Comparatori.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Trenirovka implements Comparable<Trenirovka> {
    String name;
    Integer cena;
    double reiting;

    public Trenirovka(String name, Integer cena, double reiting) {
        this.name = name;
        this.cena = cena;
        this.reiting = reiting;
    }

    @Override
    public String toString() {
        return "Trenirovka{" +
               " name='" + name + '\'' +
               ", cena=" + cena +
               ", reiting=" + reiting +
               '}';
    }

    @Override
    public int compareTo(Trenirovka trenirovka) {
        int res = this.name.compareTo(trenirovka.name);
        if (res == 0) {
            int fac = this.cena.compareTo(trenirovka.cena);
            if (fac == 0) {
                if (this.reiting == trenirovka.reiting) {
                    return 0;
                } else if (this.reiting < trenirovka.reiting) {
                    return -1;
                } else return 1;
            }
            return fac;
        }

        return res;
    }

    public static void main(String[] args) {
        List<Trenirovka> list = new ArrayList<>();

        list.add(new Trenirovka("Баскетбол", 700, 7.5));
        list.add(new Trenirovka("Волебол", 450, 5.5));
        list.add(new Trenirovka("Хокей", 1250, 9.1));
        list.add(new Trenirovka("Футбол", 650, 8.3));
        list.add(new Trenirovka("Тенис", 800, 4.2));
        list.add(new Trenirovka("Тенис", 750, 2.1));
        list.add(new Trenirovka("Тенис", 750, 3.2));

        Collections.sort(list);
        System.out.println("Отсортированный лист по имине цене и рейтингу \n" + list);
        list.sort(new RetingComparator());
        System.out.println("Отсортированный лист рейтингу  \n" + list);
    }
}

class RetingComparator implements Comparator<Trenirovka> {

    @Override
    public int compare(Trenirovka o1, Trenirovka o2) {
        if (o1.reiting == o2.reiting) {
            return 0;
        } else if (o1.reiting < o2.reiting) {
            return -1;
        } else return 1;
    }
}