package stroki;

import java.util.Scanner;

public class ImaParol8do15simvProverca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String name = sc.nextLine();
        System.out.print("Создайте пароль: ");
        String PW = sc.nextLine();
        if (PW.length() < 8 || PW.length() > 15) {
            do {
                System.out.println("Длина пароля должна составлять от 8 до 15 символов");
                PW = sc.nextLine();
               } while (PW.length() <8 || PW.length() > 15);
        }
        System.out.printf("%s, Ваш новый пароль: %s", name, PW);
    }
}
