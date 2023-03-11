package Ycheba.String;

/*Реализуйте метод convertString(), который принимает на вход строку и, если первая буква не заглавная,
возвращает перевернутый вариант исходной строки. Если первая буква заглавная, то строка возвращается без
изменений. Если на вход передана пустая строка, метод должен вернуть пустую строку.

App.convertString("Hello"); // "Hello"
App.convertString("hello"); // "olleh"

// Не забудьте учесть пустую строку!
App.convertString(""); // ""

Метод Character.isUpperCase() – проверяет, находится ли символ в верхнем регистре

Character.isUpperCase('s'); // false
Character.isUpperCase('A'); // true
Метод StringUtils.reverse() из библиотеки Apache Commons Lang – выполняет переворот строки

StringUtils.reverse("bat"); // "tab"

 */
public class SravnenieAndRevers {
    public static void main(String[] args) {
        System.out.println(SravnenieAndRevers.convertString("Привет"));
        System.out.println(SravnenieAndRevers.convertString("пока"));
        System.out.println(SravnenieAndRevers.convertString(""));
        System.out.println(SravnenieAndRevers.convertString("бывает"));
    }


    public static String convertString(String string) {
        if (string.equals("")) {
            return "";
        }

        return Character.isUpperCase(string.charAt(0)) ? string : "Реверс";//StringUtils.reverse(string);
    }

}
