package Ycheba.nested_classes.static_nested_class;


/*
Вложенный класс
если класс статичный его можно создать как обычный класс
внешний класс может обращятся к переменным внутренниго класса
внутренний класс может обращятся к даже приватным переменным внешнего класса
для не статических переменных сначало нужно создать класс а потом к ним можно обращятся
 */
public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    void method(){
        System.out.println(Engine.b);//можем обратиться к переменной внутреннего класса
        Engine e = new Engine(200);
        System.out.println(e.horsePower);//а для обращения к нестатичным переменным нужна сначало создать класс
    }

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
               "color='" + color + '\'' +
               ", doorCount=" + doorCount +
               ", engine=" + engine +
               '}';
    }
    public static class Engine{
       private int horsePower;
        private static int b;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(a);//можем обратиться к переменной внешнего класса
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                   "horsePower=" + horsePower +
                   '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);//вот так он создается
        System.out.println(e);

        Car car = new Car("red", 2, e);
        System.out.println(car);
        Car car1 = new Car("elo", 4 , new Car.Engine(356));
        System.out.println(car1);
    }
}