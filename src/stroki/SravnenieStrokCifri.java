package stroki;

public class SravnenieStrokCifri {
    public static void main(String[] args) {
        String user1 = "Вова";
        String user2 = "Иван Виктор";
        checkUserName(user1,user2);
        }

        private static void checkUserName(String user1, String user2) {
        if (user1.equalsIgnoreCase(user2)==true)
            System.out.println("Выберите другое имя");
        else
            System.out.println("Ваше имся имеет длину "+user2.length()+" символов");
        }
}
