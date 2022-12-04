package Nasledovanie;

import Nasledovanie.Zombie;

public class MainZombi {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.add(new Zombie("Noname"));
        battle.add(new GiantSnake("Noname"));

        battle.start();
//        Zombie zombie2 = new Zombie("Bob");
//
//        zombie2.growl();
//        zombie2.attack();
    }
}
