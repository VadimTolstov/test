package Ycheba.Object;

import java.util.ArrayList;

/*Переопределяем equals
 */
public class PereopredelenieEquals {
    public static void main(String[] args) {
        Car c1 = new Car("Синяя", "V8");
        Car c2 = new Car("Синяя", "V8");
        Car c3 = new Car("Зеленая", "Р8");

        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c2));

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        Car car4 = new Car("Зеленая", "Р8");
        System.out.println(list.contains(car4));
        System.out.println(car4);
    }
}

class Car {
    
    {
        System.out.println("Привет Мир ");
    }

    static {
        System.out.println("Привет статичный мир");
    }
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color)) && (engine.equals(c2.engine));
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
               "color='" + color + '\'' +
               ", engine='" + engine + '\'' +
               '}';
    }
}