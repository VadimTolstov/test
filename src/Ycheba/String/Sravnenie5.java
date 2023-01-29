package Ycheba.String;


//Измените код из предыдущего задания так, чтобы в случае, если
// имя пользователя уникальное, пользователю также сообщалось
// бы "Ваше имя имеет длину <длина имени> символов", где вместо
// <длина имени> стоит соответствующее число. Проверьте, что ваша
// программа работает корректно, заменив имя "Иван" на другое, например "Вован".
//Также показывает размер имени без пробелов

class Sravnenie5 {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Вован Иванов";
        checkUserName(user1, user2);
    }

    private static void checkUserName(String user1, String user2) {
        String user2copy = user2.replace(" ", "");
        if (user1.equalsIgnoreCase(user2) == true)
            System.out.println("Выберите другое имя пользователя");
        else {
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + user2.length() + " символов");
            System.out.println("А без пробелов ваше имя имеет занимает " + user2copy.length() + " символов");
        }
    }
}
