package ObjectZoo.Zoo;

public class MainZoo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.changer(new PopcornStall(), 1); //вариант 1 говорим на что поменять и где поменять в массиве
        zoo.sound();
        zoo.print(); //вариант 1
        //       zoo.changer(new Dog(), 2);//вариант 2
        //       System.out.println(zoo);//вариант 2
    }
}
