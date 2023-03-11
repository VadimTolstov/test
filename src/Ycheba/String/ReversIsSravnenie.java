package Ycheba.String;
/*Реализуйте метод isPalindrome(). Метод принимает в качестве параметра строку и определяет, является ли эта
строка палиндромом или нет без учета регистра

App.isPalindrome("шалаш"); // true
App.isPalindrome("ага"); // true
App.isPalindrome("хекслет"); // false

// Слова в метод могут быть переданы в любом регистре
App.isPalindrome("Ага"); // true
Для определения палиндрома, необходимо перевернуть строку и сравнить ее с исходной. Для этого воспользуйтесь
методом StringUtils.reverse()

StringUtils.reverse("мама"); // "амам"

 */

public class ReversIsSravnenie {
    public static void main(String[] args) {

    }


//    public static boolean isPalindrome(String nami) {
//       return StringUtils.reverse(nami).equalsIgnoreCase(nami);
//
//
//    }
}

/*Переворачиваем строку с помощью библиотеки StringUtils
Если в вашем проекте уже подключена библиотека StringUtils, будет удобно воспользоваться именно ею.
Если вы не подключили библиотеку, это можно сделать с помощью подключения зависимости в файле pom.xml:

<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.9</version>
</dependency>

 */