package Ycheba.nested_classes.inner_class;

/*
внутренний класс нестатичный завязан на создании внешнего класса (нет внешнего нельзя тогда создать внутренний класс)
внутренний нестатик класс может содержать только не статические элементы если он только не финальный
внутренний нестатик класс может обращятся к приватным элементам внешенго класса
внешний класс может не может обращятся к элемента внутреннего класса пока не создатся внутренний класс
 */
public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        Engine e = new Engine(10);
        System.out.println(e);//обращяемся к элементу внутреннего класс только после создания объекта внутреннего класса
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);//this это класс Car точка показваем что обращяемся к элементу класса
        //и создаем новый мотор Engine и даме horsePower
    }

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
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

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(doorCount);//выводим переменную внешнего класса
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                   "horsePower=" + horsePower +
                   '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
//        Car.Engine e = new Car.Engine(256);//вот так он создается
        Car car = new Car("black", 4, 300);
        Car.Engine engine = car.new Engine(250);// сначало создали объект вснешнего класса car а потом смогли уже engine car.new Engine(250)
        System.out.println(car);
        System.out.println(engine);
        car.setEngine(engine);
        System.out.println(car);

        Car.Engine engine1 = new Car("yello", 2).new Engine(200);//можно создать engine1 так но потеряется ссылка на Car (не популярно)
        System.out.println(engine1);

 //       Car car1 = new Car("red", 1, new Engine(100)); так не создать класс
    }
}