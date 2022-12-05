package ObjectZoo.Zoo;

public class Reptile extends Animal{
    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Я класс Рептилий";
    }
}


