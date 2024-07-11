package Ycheba.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        animals.add(fish);

        for (Animal s : animals) {
            s.eat();
        }
        System.out.println("-------------------------------------------------");

        ArrayList<AbleToRun> arrayListAbleToRun = new ArrayList<>();//добавляем в лист животных которые используют интерфейс
        arrayListAbleToRun.add(dog);
        arrayListAbleToRun.add(cat);
        arrayListAbleToRun.add(bird);
        for (AbleToRun s : arrayListAbleToRun) {
            s.run();
        }
        System.out.println("-------------------------------------------------Апкаст");

        AbleToFly ableToFly = new Bird();//здесь автоматический апкаст
        ableToFly.fly();
        System.out.println("-------------------------------------------------Даункаст");
        Bird bird1 = (Bird) ableToFly;//даункаст
        bird1.eat();
        ((Bird) ableToFly).run();//и здесь даункаст

        System.out.println("-------------------------------------------------");

        Animal animal = new Dog();//создали с родительского класса Animal (здесь происходит апкаст). Компилятор проверяет это действие
        animal.eat();//можем использовать только методы с родительского класса это Animal
//        animal.run();//не можем вызвать метод с класса Dog т.к его нет в классе Animal по этому run() нельзя вызвать
        Dog dog1 = (Dog) animal;// даунткаст (явное приведение типов) приведение типов. Компилятор НЕ проверяет это действие
        dog1.run();
    }
}
