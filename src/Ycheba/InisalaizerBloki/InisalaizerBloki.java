package Ycheba.InisalaizerBloki;
/*Показывает как работают блоки при наследовании
 */
public class InisalaizerBloki {

    public static void main(String[] args) {
        Lion l = new Lion();
    }
}

class Animal{
    Animal(){
        System.out.println("Конструктор Animal");
    }
    static {
        System.out.println("Статичный блок Animal");
    }

    {
        System.out.println("Non-статичный блок Animal");
    }
}

class Mammal extends Animal{
    Mammal(){
        System.out.println("Конструктор Mammal");
    }
    static {
        System.out.println("Статичный блок Mammal");
    }

    {
        System.out.println("Non-статичный блок Mammal");
    }
}
class Lion extends Mammal{
    Lion(){
        System.out.println("Конструктор Lion");
    }
    static {
        System.out.println("Статичный блок Lion");
    }

    {
        System.out.println("Non-статичный блок Lion");
    }
}
