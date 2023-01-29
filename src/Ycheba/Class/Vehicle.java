package Ycheba.Class;

class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    //Это конструктор класса Vehicle
    public Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Отображение дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap; //return вернет данные, невернет данные в void
    }

    // Расчет количества топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}


// В этом классе объявляется объект типа Vehicle
class AddMeth {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7, 16, 21); // создание объекта minivan типа Vehicle
        Vehicle sportscar = new Vehicle(2, 14, 12); // создание объекта sportscar типа Vehicle
        double gallons;
        int dist = 252;
        int range1, range2;

        // Присваивание значений полям в объекте minivan
        //  minivan.fuelcap = 16;     При создании конструктора убрали
        // minivan.passengers = 7;
        //  minivan.mpg = 21;

        // Присваивание значений полям в объекте sportscar
        //  sportscar.fuelcap = 14;   При создании конструктора убрали
        //   sportscar.passengers = 2;
        //   sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +
                           " миль мини-фургону требуется " +
                           gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +
                           " миль спортивному автомобилю требуется " +
                           gallons + " галлонов топлива");

        // Получение дальности поездки для разных
        // транспортных средств
        range1 = minivan.range(); //присвоение переменной значения, возращаемого метода
        range2 = sportscar.range();//можно убрать эти 2 строки кода добавив sportscar.range()
        // и minivan.range() в  System.out.println и все будет работать

        if (minivan.range() > sportscar.range())
            System.out.println("minivan  проедит больше  sportscar");

        System.out.println("Мини-фургон может перевезти " + minivan.passengers +
                           " пассажиров на расстояние " + range1 + " миль.");


        System.out.println("Спортивный автомобиль может перевезти " +
                           sportscar.passengers + " пассажиров на расстояние " +
                           range2 + " миль.");

    }
}