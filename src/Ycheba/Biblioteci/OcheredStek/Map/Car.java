package Ycheba.Biblioteci.OcheredStek.Map;

import java.util.Objects;

//Нужно сравнить все автомобили по полям brand, name, onSale и посчитать их колличиства совпадений
class Car extends Object {

    //делаем финальные т.к бренд не меняется
    private final String brand;//делаем финальные

    //делаем финальные т.к имя не меняется
    private final String name;//делаем финальные
    private boolean onSale;

    public Car(String brand, String name, boolean onSale) {
        //проверка на null т.к при создании equals мы выбрали что
        //brand и name не может быть null, делаем условия и исключения
        if (brand == null || name == null) {
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        this.brand = brand;
        this.name = name;
        this.onSale = onSale;
    }

    public String getBrand() {
        return brand;
    }

    //у финальных значений не может быть Сетеров
    // public void setBrand(String brand) {
    //      this.brand = brand;
    //  }

    public String getName() {
        return name;
    }
    //у финальных значений не может быть Сетеров
    // public void setName(String name) {
    //     this.name = name;
    // }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    //Создаем через идею для Map
    //И утверждаем что обьекты типа автомобиль равны если равны все 3 поля
    //brand, name, onSale
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return onSale == car.onSale && brand.equals(car.brand) && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name);
    }

    @Override
    public String toString() {

        return "Car{ " +
               "brand = '" + brand + '\'' +
               ", name = '" + name + '\'' +
               ", onSale = " + onSale + '}';
    }
}


