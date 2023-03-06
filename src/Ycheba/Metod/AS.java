package Ycheba.Metod;

/*Допишите публичный статический метод App.truncate(),
который обрезает переданную строку до указанного количества символов, добавляет в конце многоточие и
возвращает получившуюся строку. Подобная логика часто используется на сайтах, чтобы отобразить длинный
текст в сокращенном виде. Метод принимает два параметра:

Строка (String), которую нужно обрезать
Число (int) символов, которые нужно оставить
Пример того, как должен работать написанный вами метод:*/

public class AS {
    public static void main(String[] args) {
        var hurray = AS.truncate("it works!", 4);
        var hurray1 =  AS.truncate("hexlet", 2);
        System.out.println(hurray);
        System.out.println(hurray1);
    }

    public static String truncate(String text, int length){

        return text.substring(0, length)+"...";
    }


}
