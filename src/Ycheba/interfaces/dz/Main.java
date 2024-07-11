package Ycheba.interfaces.dz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Programmer programmer = new Programmer();
        Cook cook = new Cook();
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(director);
        workers.add(programmer);
        workers.add(cook);
        for (Worker s : workers) {
            s.work();
        }
        System.out.println("------------------");
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(cook);
        drivers.add(programmer);
        for (Driver s : drivers) {
            s.drive();
        }
    }
}
