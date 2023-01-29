package Ycheba.Biblioteci.Exceptions;

import java.text.NumberFormat;
import java.text.ParseException;

//В данном примере мы попытаемся привести строку к числу с помощью
// класса NumberFormat. Для этого мы заведомо дадим неправильные данные.
class Exceptions3 {
    public static void main(String[] args) {
        try {
            NumberFormat nf = NumberFormat.getInstance();
            //специально создаем ситуацию, которая приведет к исключению
            System.out.println(nf.parse("NOT A NUMBER"));
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Конец программы!");
    }
}
