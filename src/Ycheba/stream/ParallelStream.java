package Ycheba.stream;

import java.util.ArrayList;
import java.util.List;
/*
parallelStream - Java смотрит сколько ядер и делет процесс на ядра и потом результат перемножает и получает 16.25
но если поставить деление то получим некорректные данные 0.125
 */
public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(5.0);
        list.add(10.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream()
                .reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("sumResult = " + sumResult);

        double sumResultParallel = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("sumResultParallel = " + sumResultParallel);
    }
}
