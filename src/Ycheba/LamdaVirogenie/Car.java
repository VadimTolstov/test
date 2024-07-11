package Ycheba.LamdaVirogenie;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

/*
Supplier Поставщик у него есть гет который возращяет обьект
Consumer потребляет объект (что то с ним сделать)
 */

class Car {
    String model, color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", color='" + color + '\'' +
               ", engine=" + engine +
               '}';
    }
}

class Test {
    //Supplier<T> имеет у себя метод T get который просто возвращяет переданный элемент
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {//Consumer потребитель и у него есть метод  void accept(T t);
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "silver metalic", 1.6));//используя лямда выражение выводим метод createThreeCars в котором создали и передали Car
        System.out.println("ourCars: " + ourCars);

        //ПЕРВЫЙ ВАРИАНТ
        //здесь в лямда выражении (car -> ) мы уже пишем что делает accept в методе changeCar
        changeCar(ourCars.get(0), car -> {//несколько действий нужны фигруные скобки
            car.color = "red";
            car.engine = 2.6;
            System.out.println("updated car: " + car);
        });
        System.out.println("ourCars: " + ourCars);

        //ВИТОРОЙ ВАРИАНТ
        //Сразу создаем Consumer и сразу показываем как должен работать метод  accept  (после car -> accept идет)
        Consumer<Car> consumer = car -> {//несколько действий нужны фигруные скобки
            car.color = "elo";
            car.engine = 3.7;
            System.out.println("updated car: " + car);
        };
        //здесь уже передаем что хотим аптейдить в accept параметр (ourCars.get(1))
        consumer.accept(ourCars.get(1));
        System.out.println("ourCars: " + ourCars);
    }
}
