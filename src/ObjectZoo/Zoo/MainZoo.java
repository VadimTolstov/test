package ObjectZoo.Zoo;

public class MainZoo {

    public static void main(String[] args) {
        Zoo zoo =new Zoo();
     //вариант 1   zoo.changer(new PopcornStall(), 1); // говорим на что поменять и где поменять в массиве
     //   zoo.print(); вариант 1
        zoo.changer(new Dog(), 2);//вариант 2
        System.out.println(zoo);//вариант 2
    }
}
