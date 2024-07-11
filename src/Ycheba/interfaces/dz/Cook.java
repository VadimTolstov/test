package Ycheba.interfaces.dz;

public class Cook implements Worker, Driver{
    @Override
    public void drive() {
        System.out.println("Повар едет");
    }

    @Override
    public void work() {
        System.out.println("Повар работает");
    }
}
