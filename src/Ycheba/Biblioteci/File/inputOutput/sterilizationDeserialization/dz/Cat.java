package Ycheba.Biblioteci.File.inputOutput.sterilizationDeserialization.dz;

import java.io.Serializable;

public class Cat implements Serializable {

    private static final long serialVersionUID = -5707624118850557543L;
    private final String name, breed;
    private double weight;

    public Cat(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
               "name='" + name + '\'' +
               ", breed='" + breed + '\'' +
               ", weight=" + weight +
               '}';
    }
}
