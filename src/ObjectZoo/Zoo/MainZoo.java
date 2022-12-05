package ObjectZoo.Zoo;

public class MainZoo {

    public static void main(String[] args) {
        Zoo zoo =new Zoo();
        zoo.changer(new PopcornStall(), 1); // говорим на что поменять и где поменять в массиве
        zoo.print();
    }
}
