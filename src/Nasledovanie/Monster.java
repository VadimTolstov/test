package Nasledovanie;
//Zombi
public  class Monster {
        private String name;
        private int damege;

    public Monster(String name, int damege) {
        this.name = name;
        this.damege = damege;
    }


    public void growl(){
        System.out.print(" "+ name +" ");
    }
    public void attack(){
        System.out.println(" атака " +damege+" ");
    }



}
