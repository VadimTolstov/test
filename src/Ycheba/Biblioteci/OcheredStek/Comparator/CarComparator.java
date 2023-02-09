package Ycheba.Biblioteci.OcheredStek.Comparator;

//Создали класс для сортировки для Car что бы как сортировать
import java.util.Comparator;

class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        //Сравниваем два автомобился по полю name getName возращаяет Стринг
        return car1.getName().compareTo(car2.getName());
    }
}
