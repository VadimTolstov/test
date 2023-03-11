package Ycheba.IfSwitch;

/*Реализуйте метод isLeapYear(), который определяет является ли год високосным или нет.
Год будет високосным, если он кратен (то есть делится без остатка) 400 или он одновременно кратен 4 и не кратен 100.

App.isLeapYear(2018); // false
App.isLeapYear(2017); // false
App.isLeapYear(2016); // true

 */

public class Uslovia {
    public static void main(String[] args) {
        System.out.println(Uslovia.isLeapYear(2018));
        System.out.println(Uslovia.isLeapYear(2017));
        System.out.println(Uslovia.isLeapYear(2016));

    }

    public static boolean isLeapYear(int year) {

        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}
