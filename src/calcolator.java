import java.util.Scanner;

public class calcolator {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите действие: ");
            String action = scanner.nextLine();
            action = scanner.nextLine();

            System.out.print("Введите число: ");
            int num2 = scanner.nextInt();

            int res;

            switch (action) {
                case "+":
                    res = num1 + num2;
                    System.out.println(num1 + " " + action + " " + num2 + " = " + res);
                    break;
                case "-":
                    res = num1 - num2;
                    System.out.println(num1 + " " + action + " " + num2 + " = " + res);
                    break;
                case "*":
                    res = num1 * num2;
                    System.out.println(num1 + " " + action + " " + num2 + " = " + res);
                    break;
                case "/":
                    if (num2 == 0)
                        System.out.println("Делить на 0 нельзя!");
                    else {
                        res = num1 / num2;
                        System.out.println(num1 + " " + action + " " + num2 + " = " + res);
                    }
                    break;
                default:
                    System.out.println("Вы что то перепутали");
            }

        }
    }
}

