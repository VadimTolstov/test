package Ycheba.Collekcii.exampleStep.queue;

import Ycheba.Collekcii.exampleStep.CarCollection;

/*
https://stepik.org/lesson/721077/step/1?unit=722194
 */
public interface CarQueue<T> extends CarCollection<T> {
    boolean add(T car);
    T peek();
    T poll();
}
