package Igri;

public class IgraCat {
    public static void main(String[] args) {
        Cat barsik = new Cat(3000, "Барсик", 1, "Рыжий");
        Cat bigCat = new Cat(5500, "Мурка", 2, "Черная");
        Cat smallCat = new Cat(1000, "Кузя", 1, "Белый");
        Cat barsik2 = new Cat();
        bigCat.setName("Пушок");
        System.out.println("Вес большой кошки " +  bigCat.getName());
        System.out.println("Вес большой кошки " +  smallCat.getName());
    }
}

