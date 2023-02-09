package Ycheba.Biblioteci.OcheredStek.Comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class CarMain {public static void main(String[] args) {
    Set<Car> cars = new TreeSet<>(Comparator.reverseOrder()); // строка 1
    cars.add(new Car("Toyota", 243423424L)); // строка 2
    cars.add(new Car("Subaru", 112313213L));
    System.out.println(cars);
}
}

