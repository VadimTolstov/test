package Nasledovanie;

import java.util.Locale;

public class Zombie extends Monster {
    //Fix this class
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl(){
        System.out.println("Raaaauuughhhh");
    }

    @Override
    public void attack(Monster monster){
        monster.damage(getForce());
        growl();
    }


}
