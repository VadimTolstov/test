package ObjectZoo.Zoo;

abstract public class Animal {

    public void print(){
        System.out.println(this); // одно и тоже System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Я класс животных";
    }
}
