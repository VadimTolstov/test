package Ycheba.LamdaVirogenie;

import Ycheba.Biblioteci.Exceptions.Test14;

public class Test2 {
    static void def(Test3 t) {
        System.out.println(t.abc("privet"));
    }

    static void tes(Test4 t) {
        System.out.println(t.asd("privet", "poka"));
    }

    public static void main(String[] args) {
        def(x -> x.length());//x это String в int abc(String s) дальше показывает что должен вернуть ->x.length()
        def(String::length);// тоже самое что и def(x->x.length());
        // def(()->5); если бы у метода abc не было параметра то надо было писать с пустыми скобками ()->5
        tes((x,y)->y.length());//если два параметра в тесте
    }
}

interface Test3 {
    int abc(String s);
}

interface Test4 {
    int asd(String s, String y);
}