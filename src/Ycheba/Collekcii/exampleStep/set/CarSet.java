package Ycheba.Collekcii.exampleStep.set;

import Ycheba.Collekcii.exampleStep.CarCollection;

public interface CarSet<T> extends CarCollection<T> {

    public boolean add(T car);
    public boolean remove(T car);
    int size();
    void clear();
}
