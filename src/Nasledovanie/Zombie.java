package Nasledovanie;

public class Zombie extends Monster implements Fighter {
    //Fix this class
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl(){
        System.out.println("Raaaauuughhhh");
    }



    @Override
    public void attack(Entity entity) {
        entity.damage(getForce());
        growl();
    }
}