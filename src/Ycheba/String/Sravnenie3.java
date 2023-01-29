package Ycheba.String;


//Сравнение строк и условие без учета регитсра
class Sravnenie3 {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
        if (user1.equalsIgnoreCase(user2) == true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
    }
}

