package Ycheba.Collekcii.exampleStep.list;

import Ycheba.Collekcii.exampleStep.CarCollection;

public interface CarList<T> extends CarCollection<T> {
    boolean add(T car);

    boolean remove(T car);

    int size();

    void clear();
    T get(int index);
    boolean removeAt(int index);
    boolean add(T car, int index);

    boolean contains(T car);
}
