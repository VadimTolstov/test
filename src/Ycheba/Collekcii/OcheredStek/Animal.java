package Ycheba.Collekcii.OcheredStek;

import java.util.Objects;

class Animal implements Comparable<Animal>{
    private final String animalBreed;
    private final String name;
    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Animal(String animalBreed, String name, double weight) {
        if (animalBreed == null || name == null || weight <=0)
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal anima = (Animal) o;
        return animalBreed.equals(anima.animalBreed) && name.equals(anima.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalBreed, name);
    }

    @Override
    public String toString() {
        return "Anima{" +
               "animalBreed='" + animalBreed + '\'' +
               ", name='" + name + '\'' +
               ", weight=" + weight +
               '}';
    }


    @Override
    public int compareTo(Animal o) {
        return (int) (this.weight - o.weight);
    }
}

