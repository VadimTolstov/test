package Ycheba.String;

//Напишите код, который сравнивает эти имена и выводит результат сравнения.
//Без учета регистра
class Sravnenie2 {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
        System.out.print(user1.equalsIgnoreCase(user2));
    }
}
