package Ycheba.stream.step;

import java.util.*;

public class MainUser2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));

        Optional<User> oldest = users.stream()
                .max(Comparator.comparing(User::getAge));
        oldest.ifPresent(System.out::println);
        oldest.ifPresentOrElse(System.out::println, () -> System.out.println("Пользователь не найден"));
        System.out.println();

        users.stream()
                .filter(user -> user.getName().contains("l"))
                .findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("Элемент не найден"));

        int[] array = {3, 1, 3, 5, 14};
        int[] array1 = Arrays.stream(array).filter(x -> x > 3).toArray();
        System.out.println(Arrays.toString(array1));
    }
}
