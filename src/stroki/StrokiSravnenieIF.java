package stroki;

public class StrokiSravnenieIF {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
        checkUserName(user1,user2);

    }

    private static void checkUserName(String user1, String user2) {
        if (user1.equalsIgnoreCase(user2)==true)
            System.out.println("Выберете другое имя");
        else
            System.out.println("Отличное имя!");
    }
}
