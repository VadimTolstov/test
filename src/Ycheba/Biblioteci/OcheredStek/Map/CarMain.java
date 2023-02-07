package Ycheba.Biblioteci.OcheredStek.Map;

//Нужно сравнить все автомобили по полям brand, name, onSale и посчитать их колличиства совпадений

import Ycheba.Biblioteci.OcheredStek.Map.Car;

import java.util.*;

class CarMain {

    private static final String TOYOTA = "TOYOTA";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {


        Car car1 = new Car(TOYOTA, "Carina", false);
        Car car2 = new Car(KIA, "Rio", false);
        Car car3 = new Car(BMW, "X5", false);
        Car car4 = new Car(BMW, "X3", true);
        Car car5 = new Car(BMW, "X6", false);
        Car car6 = new Car(TOYOTA, "Raw 4", true);
        Car car7 = new Car(KIA, "Ceed", false);
        Car car8 = new Car(TOYOTA, "Yaris", false);
        Car car9 = new Car(BMW, "320i", false);
        Car car10 = new Car(TOYOTA, "Corrolla", false);
        Car car11 = new Car(TOYOTA, "Carina", false);
        Car car12 = new Car(KIA, "Rio", false);
        Car car13 = new Car(BMW, "X5", false);
        Car car14 = new Car(BMW, "X3", false);
        Car car15 = new Car(BMW, "X6", false);
        Car car16 = new Car(TOYOTA, "Raw 4", true);
        Car car17 = new Car(KIA, "Ceed", false);
        Car car18 = new Car(TOYOTA, "Yaris", false);
        Car car19 = new Car(BMW, "320i", false);
        Car car20 = new Car(TOYOTA, "Corrolla", false);
        Car car21 = new Car(TOYOTA, "Carina", false);
        Car car22 = new Car(KIA, "Rio", false);
        Car car23 = new Car(BMW, "X5", false);
        Car car24 = new Car(BMW, "X3", false);
        Car car25 = new Car(BMW, "X6", false);
        Car car26 = new Car(TOYOTA, "Raw 4", true);
        Car car27 = new Car(KIA, "Ceed", true);
        Car car28 = new Car(TOYOTA, "Yaris", false);
        Car car29 = new Car(BMW, "320i", false);
        Car car30 = new Car(TOYOTA, "Corrolla", false);


        //Создали лист
        List<Car> carlist = new ArrayList<>();
        //Добавили наши car в лист
        carlist.add(car1);
        carlist.add(car2);
        carlist.add(car3);
        carlist.add(car4);
        carlist.add(car5);
        carlist.add(car6);
        carlist.add(car7);
        carlist.add(car8);
        carlist.add(car9);
        carlist.add(car10);
        carlist.add(car11);
        carlist.add(car12);
        carlist.add(car13);
        carlist.add(car14);
        carlist.add(car15);
        carlist.add(car16);
        carlist.add(car17);
        carlist.add(car18);
        carlist.add(car19);
        carlist.add(car20);
        carlist.add(car21);
        carlist.add(car22);
        carlist.add(car23);
        carlist.add(car24);
        carlist.add(car25);
        carlist.add(car26);
        carlist.add(car27);
        carlist.add(car28);
        carlist.add(car29);
        carlist.add(car30);

        //Создаем Map ключем будет Car и типом значения будет Integer количество равных значений
        Map<Car, Integer> carMap = new HashMap<>();

        //Теперь последовательно итеративно добавим в нашу carMap все элементы carlist
        for (Car car : carlist) {
            //Если наша carMap содержит ключь передаваемы car из нашего цикла итерации по листу
            if (carMap.containsKey(car)) {
                //Мы говорим достанька нам пожалуста значения которое лежит по этому ключу car
                int value = carMap.get(car);
                //и теперь мы хотим переложить это значения по нашему ключу при этом повысив значение
                //value на еденицу
                carMap.put(car, ++value);
                //если мы не нашли наш ключь в нашей carMap тогда машина уникальна и мы можем ее спокойно положить
            } else {
                carMap.put(car, 1);
            }
        }
        //итерация у Map происходит по другому Нужны обьекты Map.Entry по ключу Car и значению Integer
        //carEntry и пробегаем доставая entrySet  из carMap на каждой итерации мы должны достать из carMap вытащить entrySet
        for (Map.Entry<Car, Integer> carEntry : carMap.entrySet()) {
            //вызываем 2 сушьности сначало ключь carEntry.getKey() и потом значения carEntry.getValue()
            System.out.println(carEntry.getKey() + "=" + carEntry.getValue());

            //Car{ brand = 'KIA', name = 'Rio', onSale = false}=3 после равно тройка это value
        }
    }


}