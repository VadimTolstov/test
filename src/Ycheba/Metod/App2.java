package Ycheba.Metod;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/*Рассчитаем количество дней между двумя датами, используя встроенные возможности Java*/

class App2 {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        // С даты
        LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
// По дату
        LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
// Количество дней между этими датами
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);

        // END
    }
}