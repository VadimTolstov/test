package Ycheba.Class.Static;

// Применение статической переменной
class StaticDemo {
    int x; // обычная переменная экземпляра
    static int y; // статическая переменная  Все объекты используют одну и ту
    // же копию статической переменной

    // Возврат суммы значений переменной экземпляра х и
// статической переменной у
    int sum() {
        return x + y;
    }
}

class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

    // У каждого объекта имеется своя копия
    // переменной экземпляра
        ob1.x = 10; //присвоение не статической переменной значения через обьект.х
        ob2.x = 20;
        System.out.println("Разумеется, obl.x и ob2.x   независимы");
        System.out.println("obi.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

    // Все объекты совместно используют одну общую
    // копию статической переменной
        System.out.println("Статическая переменная у - общая");
        StaticDemo.y = 19; // присвоение статической переменной значения через класс.y
        System.out.println("Присвоить StaticDemo.у значение 19");
        System.out.println("obi.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
        StaticDemo.y = 100; // присвоение статической переменной значения через класс.y
        System.out.println("Изменить значение StaticDemo.y на 100й");
        System.out.println("obi. sum () : " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}
