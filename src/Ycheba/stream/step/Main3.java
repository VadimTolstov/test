package Ycheba.stream.step;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Float> number = new ArrayList<>();
        for (int i = 0; i < 30_000_000; i++) {
            number.add((float) i);
        }
        long before = System.currentTimeMillis();
        number.parallelStream().map(x -> Math.sin(0.2f + x / 5) * Math.cos(0.2f + x / 5) * Math.cos(0.4f + x / 5)).collect(Collectors.toList());
        long after = System.currentTimeMillis();
        System.out.println(after-before);
    }
}
