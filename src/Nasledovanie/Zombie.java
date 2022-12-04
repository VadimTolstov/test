package Nasledovanie;

import java.util.Locale;

public class Zombie extends Monster {
    //    public Zombie(String name, int damege) {
//        super(name+"монстр", damege);
    // }
    public static String scream = "Raaaugghhh";

    public Zombie(String name) {

        super(name + " the Zombie ", 5);
    }


    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();

    }

    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.println(scream.toUpperCase());
        }
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }


}
