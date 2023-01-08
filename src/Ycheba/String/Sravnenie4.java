package Ycheba.String;

//Измените код из предыдущего задания Sravnenie3 так, чтобы вся проверка была выделена
// в отдельный метод с именем, например checkUserName().
//

class Sravnenie4 {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
        checkUserName(user1, user2);
    }

    private static void checkUserName(String user1, String user2) {
        if (user1.equalsIgnoreCase(user2) == true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
    }
}
