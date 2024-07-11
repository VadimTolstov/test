package Ycheba.Generik.practica;

class Test {
    public static void main(String[] args) {
        Bear bear1 = new Bear("Леха", "Белый медведь", 50);
        Bear bear2 = new Bear("Олег", "Бурый медведь", 20);
        Bear bear3 = new Bear("Витек", "Амурский медведь", 35);
        Bear bear4 = new Bear("Серега", "Таежный медведь", 71);

        Tiger tiger1 = new Tiger("Шархан", "Амурский тигр", 15);
        Tiger tiger2 = new Tiger("Тоби", "Саранский тигр", 7);
        Tiger tiger3 = new Tiger("Потрашитель", "Алтайский тигр", 25);
        Tiger tiger4 = new Tiger("Пузик", "Татарский тигр", 10);

        Group<Bear> groupBear1 = new Group<>("Таежные мишки");
        Group<Bear> groupBear2 = new Group<>("Дикие мишки");

        Group<Tiger> groupTiger1 = new Group<>("Японские тигры");
        Group<Tiger> groupTiger2 = new Group<>("Шанхайские тигры");

        groupBear1.addNewAnimal(bear3);
        groupBear1.addNewAnimal(bear4);
        groupBear2.addNewAnimal(bear1);
        groupBear2.addNewAnimal(bear2);
        System.out.println("---------------------------------");

        groupBear1.informationAboutTheGroup(groupBear1);
        System.out.println("---------------------------------");

        groupBear1.playWith(groupBear2);
        System.out.println("---------------------------------");

        groupTiger1.addNewAnimal(tiger1);
        groupTiger1.addNewAnimal(tiger2);
        groupTiger2.addNewAnimal(tiger3);
        groupTiger2.addNewAnimal(tiger4);
        System.out.println("---------------------------------");

        groupTiger1.informationAboutTheGroup(groupTiger1);
        System.out.println("---------------------------------");

        groupTiger1.playWith(groupTiger2);
    }
}
