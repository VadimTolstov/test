package Ycheba.stream.step.dz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDz2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add((int) (Math.random() * 100 + 100));
        }
        List<String> filter = list.stream()
                .filter(x -> x % 5 == 0 && x % 2 == 0)
                .map(Math::sqrt)
                .map(x -> "Корень: " + x)
                .collect(Collectors.toList());
        System.out.println(filter);
    }
}
