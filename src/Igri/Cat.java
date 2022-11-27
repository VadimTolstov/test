package Igri;

public class Cat {
    private double weight;
    private String name;
    private int age;
    private String color;

    private static int catCount; //Статическое поле

    public Cat() {
        this.weight = 0.0f;
        this.name = "Барсик";
        this.color = "Рыжий";
        this.age = 1;
        System.out.println("Привет от бариска 2! ");

    }

    public Cat(double weight, String mame, int age, String color) {
        System.out.println("Привет из конструктора 1!");
        this.weight = weight;
        this.name = mame;
        this.age = age;
        this.color = color;
        catCount++; //Увеличиваем счетчик кошек
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age) //кошки не молодеют!
            this.age = age;
    }

    public String getColor() {
        return color;
    }

    //метод для садиста
    public void setColor(String color) {
        this.color = color;
        // и так жалобно
        meow();
        meow();
        meow();
    }

    public void meow() {
        System.out.println("Мяу");
    }

    public void pee() {
        this.weight -= 20;
    }

    public void eat() {
        this.weight += 50;
        //сами вызываем свою функцию, если надо
        if (50 / weight > .01)
            pee();
    }

}
