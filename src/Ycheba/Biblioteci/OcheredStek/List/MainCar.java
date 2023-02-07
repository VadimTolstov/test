package Ycheba.Biblioteci.OcheredStek.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//перекладываем лист в сет и убераем повторения
class MainCar {

    private static final String TOYOTA = "TOYOTA";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {

        Set car1 = new Set(TOYOTA, "Carina", false);
        Set car2 = new Set(KIA, "Rio", false);
        Set car3 = new Set(BMW, "X5", false);
        Set car4 = new Set(BMW, "X3", false);
        Set car5 = new Set(BMW, "X6", false);
        Set car6 = new Set(TOYOTA, "Raw 4", true);
        Set car7 = new Set(KIA, "Ceed", false);
        Set car8 = new Set(TOYOTA, "Yaris", false);
        Set car9 = new Set(BMW, "320i", false);
        Set car10 = new Set(TOYOTA, "Corrolla", false);

        //Вывести в консоль только TOYOTA и BMW , TOYOTA все машины были на продаже
        //Создали лист
        List<Set> carlist = new ArrayList<>();
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

        //Создаем итератор для возможности удаления обьекта из списка
        Iterator<Set> iterator = carlist.iterator();

        //Пока в итераторе есть элемент мы вытаскиваем из него этот элемент
        while (iterator.hasNext()) {
            Set car = iterator.next();//вернет нам обьект типа car

            //Проверяем есть ли в итераторе(списке теперь) KIA
            if (car.getBrand().equals(KIA)) {
                //удаляем KIA
                iterator.remove();
                //Проверяем есть ли в итераторе(списке теперь) TOYOTA
            } else if (car.getBrand().equals(TOYOTA)) {
                //Выставляем все TOYOTA на продажу
                car.setOnSale(true);

            }
        }

        for (Set car: carlist){
            System.out.println(car);
        }
    }


}


