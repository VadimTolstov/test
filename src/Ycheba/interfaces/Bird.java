package Ycheba.interfaces;

public class Bird extends Animal implements AbleToRun, AbleToFly{
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }

    @Override
    public void run() {
        System.out.println("Птица бежит");
    }

    @Override
    public void eat() {
        System.out.println("Птичий корм");
    }
}


