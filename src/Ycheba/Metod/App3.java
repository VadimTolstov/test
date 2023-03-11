package Ycheba.Metod;

/*Реализуйте метод getHiddenCard(), который принимает на вход номер кредитки (всегда состоит из 16 цифр)
в виде строки и возвращает его скрытую версию, которая может использоваться на сайте для отображения.
Если исходная карта имела номер 2034399002125581, то скрытая версия выглядит так ****5581.
Другими словами, функция заменяет первые 12 символов, на звездочки. Количество звездочек регулируется вторым
необязательным параметром. Значение по умолчанию — 4.

// Кредитка передается внутрь как строка
// Номер кредитки всегда содержит 16 цифр
App.getHiddenCard("2034399002121100", 1); // "*1100"
App.getHiddenCard("1234567812345678", 2); // "**5678"
App.getHiddenCard("1234567812345678", 3); // "***5678"
App.getHiddenCard("1234567812345678");    // "****5678"
Подсказка
Эту задачу можно решить так: взять последние 4 символа номера карты и добавить к ним спереди определённое количество звездочек

Для извлечения подстроки из строки используйте метод substring()

Для выполнения задания вам также понадобится метод строки repeat(), который повторяет строку указанное количество раз:

"+".repeat(5); // "+++++"
"o".repeat(5); // "ooooo"
"*".repeat(5); // "*****"
*/

public class App3 {
    public static void main(String[] args) {
        System.out.println(App3.getHiddenCard("2034399002121100", 1));
        System.out.println(App3.getHiddenCard("1234567812345678", 2));
        System.out.println(App3.getHiddenCard("1234567812345678", 3));
        System.out.println(App3.getHiddenCard("1234567891011121"));
    }

    public static String getHiddenCard(String cardNumber, int starsCount) {
        String visibleDigitsLine = cardNumber.substring(12);
        return "*".repeat(starsCount) + visibleDigitsLine;
    }

    public static String getHiddenCard(String cardNumber) {
        return App3.getHiddenCard(cardNumber, 4);
    }
}



