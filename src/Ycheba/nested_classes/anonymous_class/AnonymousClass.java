package Ycheba.nested_classes.anonymous_class;

/*
Здесь создаем анонимные классы и используем их
анонимный класс используется когда надо на ходу создать объект класса, но потом его нельзя использовать повторно
анонимный класс не имеет имени
невозможно написать конструктор
может обращаться даже к приватным элементам внешнего класса (но придется создать экземпляр внешнего класса)
лямбда выражение это краткая написания анонимных классов
понятия анонимных интерфейсов не существует
 */
public class AnonymousClass {
    private int x =5;
    public static void main(String[] args) {
        Math m = new Math() { //здесь какой-то класс имплементируют интерфейс Math и использовал его метод
            @Override
            public int doOperation(int a, int b) {
                AnonymousClass ac = new AnonymousClass();//создаем экземпляр внешнего класса
                return a + b+ac.x;//использую приватную переменную внешнего класса
            }
        };

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        MathN mathN = new MathN() {
            @Override
            int doOperation(int a, int b) {
                return super.doOperation(a, b);
            }
        };

        System.out.println("m " + m.doOperation(3, 6));
        System.out.println("m2 " + m2.doOperation(3, 6));
        System.out.println("mathN " + mathN.doOperation(6, 3));
    }
}

interface Math {
    int doOperation(int a, int b);
}

class MathN {
    int doOperation(int a, int b) {
        return a / b;
    }
}