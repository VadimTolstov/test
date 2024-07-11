package Ycheba.stream.step;

import java.util.ArrayList;
import java.util.List;

public class MainUser {
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

        boolean count = users.stream()
                .noneMatch(user -> user.getAge() <= 18);
        System.out.println(count);

        List<User> count2 = users.stream()
                .sorted((user1, user2) -> Integer.compare(user2.getAge(), user1.getAge()))
                .limit(3)
                .toList();

//        List<User> count2 = users.stream()
//                .sorted(Comparator.comparingInt(User::getAge)).limit(3).toList();

        users.stream()
                .sorted((user1, user2) -> Integer.compare(user2.getAge(), user1.getAge()))
                .limit(3)
                .forEach(System.out::println);
    }
}
