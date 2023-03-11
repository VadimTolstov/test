package Ycheba.IfSwitch;

/*Реализуйте метод getNumberExplanation(), который принимает на вход число и возвращает строку –
объяснение этого числа. Если для числа нет объяснения, то возвращается null:

App.getNumberExplanation(8);   // null

// Объяснения есть только для указанных ниже чисел
App.getNumberExplanation(666); // "devil number"
App.getNumberExplanation(42);  // "answer for everything"
App.getNumberExplanation(7);   // "prime number"
*/

public class Switch {
    public static void main(String[] args) {
        System.out.println(Switch.getNumberExplanation(666));
        System.out.println(Switch.getNumberExplanation(42));
        System.out.println(Switch.getNumberExplanation(7));
        System.out.println(Switch.getNumberExplanation(1));

    }

    public static String getNumberExplanation(int number){

        return switch (number) {
            case 7 -> "prime number";
            case 42 -> "answer for everything";
            case 666 -> "devil number";
            default -> null;
        };

    }
    public static void printNumbers(int firstNumber) {
        // BEGIN (write your solution here)
        var i = 0;
       while (i < firstNumber) {
            System.out.println(firstNumber);
            firstNumber-=1;
        }
        System.out.println("finished!");
        // END
    }
}

