package Ycheba.Class;

class ParametrezirovanniKonstryctor {
    int x;

    ParametrezirovanniKonstryctor(int i) { //Этот конструктор имеет параметр
        x = i;
    }
}

class ParmConsDemo {
    public static void main(String args[]) {
        ParametrezirovanniKonstryctor t1 = new ParametrezirovanniKonstryctor(10);
        ParametrezirovanniKonstryctor t2 = new ParametrezirovanniKonstryctor(88);
        System.out.println(t1.x + " " + t2.x);
    }
}