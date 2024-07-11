package Ycheba.LamdaVirogenie;

import Ycheba.Generik.igra.Participant;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Uchim Java");
        al.add("A imenno lanbdas");
        al.removeIf(element -> element.length() < 5); //удали элемент если он меньше 5
        Predicate<String> p = el -> el.length() <5;//тоже самое что выше только в 2 строки
        al.removeIf(p);
        System.out.println(al);
    }
}
