import java.util.Scanner;

public class svetofor {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Цвет светофора?: ");
            String svetSvitafora = scanner.nextLine();
            if (svetSvitafora.equals("Зеленый")) {
                System.out.println("Ехать");
            } else if (svetSvitafora.equals("Желтый")) {
                System.out.println("Подждать");
            } else if (svetSvitafora.equals("Красный")) {
                System.out.println("Стоять");
            } else {
                System.out.println("Неверный цвет");
            }
        }
    }
}