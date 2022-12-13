package ObjectZoo.Zoo;

public class PopcornStall implements Sundable{
    public void print(){
        System.out.println(this);
    }

    public void sound(){
        System.out.println("Эй! Вкусный пупкорн тут!");
    }
    @Override
    public String toString() {
        return "Я ларек с Попкормом";
    }
}

