package Ycheba.Class.PeregryzkaMetoda;

// Перегрузка методов
class Overload {
    void ovlDemo() {                // Первая версия
        System.out.println("Без параметров");
    }

    // Перегрузка метода ovlDemo для одного параметра типа int
    void ovlDemo(int a) {           // Вторая версия
        System.out.println("Один параметр: " + a);
    }

    // Перегрузка метода ovlDemo для двух параметров типа int
    int ovlDemo(int а, int b) {     // Третья версия
        System.out.println("Два параметра: " + а + " " + b);
        return а + b;
    }

    // Перегрузка метода ovlDemo для двух параметров типа double
    double ovlDemo(double a, double b) { // Четвертая версия
        System.out.println("Два параметра типа double: " +
                           a + " " + b);
        return a + b;

    }
}

class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resl;
        double resD;

// Поочередный вызов всех версий метода ovlDemo()
        ob.ovlDemo();
        System.out.println();
        ob.ovlDemo(2);
        System.out.println();
        resl = ob.ovlDemo(4, 6);
        System.out.println("Результат вызова ob.ovlDemo(4, 6): " + resl);
        System.out.println();
        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Результат вызова ob.ovlDemo(1.1, 2.32): " + resD);
    }
}
