package Ycheba.Biblioteci.OcheredStek;

import java.util.Comparator;

class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o2.getName().length() - o1.getName().length();
    }
}
