package Ycheba.IfSwitch;

/*Реализуйте метод joinNumbersFromRange(), который объединяет все числа из диапазона в строку:

App.joinNumbersFromRange(1, 1); // "1"
App.joinNumbersFromRange(2, 3); // "23"
App.joinNumbersFromRange(5, 10); // "5678910"
*/

public class CifriString {
    public static void main(String[] args) {
        System.out.println(CifriString.joinNumbersFromRange(2, 8));
    }

    public static String joinNumbersFromRange(int start, int finish) {


        var i = start;
        String summ = "";
        while (i <= finish) {
            summ += i;
            i += 1;


        }
        return summ;
    }


}