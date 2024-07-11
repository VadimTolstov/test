package Ycheba.Generik.genericStep.dz;

import java.util.ArrayList;

public class Basket<T extends Fruit> {

    private ArrayList<T> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }

    public double getWeight() {
        double result = 0;
        for (T fruit : fruits) {
            result += fruit.getVes();
        }
        return result;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public int compare(Basket<?> basket) {
        return Double.compare(getWeight(), basket.getWeight());
    }

    public static <U extends Fruit> void transfer(Basket<? extends U> basket1, Basket<? super U> basket2) {
        basket2.fruits.addAll(basket1.fruits);
        basket1.fruits.clear();
    }
}
