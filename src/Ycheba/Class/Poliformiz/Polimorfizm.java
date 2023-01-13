package Ycheba.Class.Poliformiz;

class Polimorfizm {
    public int a;
    public int b;

    Polimorfizm(int a) {
        this.a = 15;
        this.b = 33;
    }

    public int add(int v) { // v=10
        this.a += v; //15+10
        return a; // вернет public int a=25
    }
}

class SubClass extends Polimorfizm {
    SubClass(int a, int b) {
        super(a); //25
        this.b = b;
    }

    @Override
    public int add(int v) { //v !=10?
        return super.add(v) + a; //a =25 как получить add(v)=25
    }

    public static void main(String args[]) {
        SubClass s = new SubClass(10, 12);
        System.out.println(s.add(10));
    }
}