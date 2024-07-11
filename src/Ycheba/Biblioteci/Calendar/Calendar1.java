package Ycheba.Biblioteci.Calendar;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;

class Calendar1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//мы получим текущую дату , эта строка нужна для работы 1 и 2 варианта
        int era = calendar.get(Calendar.ERA);//Эра
        int year = calendar.get(Calendar.YEAR);//Год
        int month = calendar.get(Calendar.MONTH);//Месяц Jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);//День месяца
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);//День недели
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);//Неделя года
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);//Неделя месяца

        int hour = calendar.get(Calendar.HOUR);//Час в 12 часовом формате
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);//Час в 24 часовом формате
        int minute = calendar.get(Calendar.MINUTE);//Минуты
        int second = calendar.get(Calendar.SECOND);//Секунды
        int millisecond = calendar.get(Calendar.MILLISECOND);//Миллисекунды

        System.out.println("Сейчас №1  " + hourOfDay + ":" + minute + ":" + second + " Дата " + dayOfMonth + "." + (month + 1) + "." + year + " Эра " + era);

        //А теперь посмотрим, как это сделать проще. Для этого у нас есть специальный класс, который позволяет нам сформировать время просто и элегантно:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");// тоже самое что выше но проще
        //В конструктор мы передаем паттерн, на основании которого будет форматироваться наш объект:

        System.out.println("Сейчас №2  " + dateFormat.format(calendar.getTime()));
    }
}

class Calendar2 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());//выводит дату и время
        System.out.println(LocalTime.now());//выводит время
        System.out.println(LocalDateTime.now());//выводит дату и время
    }
}

class Calendar3 {
    //Объекты Local иммьютебел(неизменны)
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, 5, 15);//приватный конструктор по этому выводим дату через метод of который возвращяет конструктор
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2014, Month.MAY, 10);//второй способ создания даты
        System.out.println(ld2);

        LocalTime lt1 = LocalTime.of(15, 30);//часы минуты
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(15, 30, 45);//часы минуты секунды
        System.out.println(lt2);
        LocalTime lt3 = LocalTime.of(15, 30, 45, 99999);//часы минуты секунды нанасекунды
        System.out.println(lt3);

        LocalDateTime ldt1 = LocalDateTime.of(2016, 5, 25, 15, 30);//дата часы минуты
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 5, 25, 15, 30, 45);//дата часы минуты секунды
        System.out.println(ldt2);
        LocalDateTime ldt3 = LocalDateTime.of(2016, Month.OCTOBER, 25, 15, 30, 45, 99999);//дата часы минуты секунды нанасекунды
        System.out.println(ldt3);

        LocalDateTime ldt4 = LocalDateTime.of(ld1, lt2);//дата часы минуты секунды вот так тоже можно вынести
        System.out.println(ldt4);
    }
}

class Calendar4 {
    //Объекты Local иммьютебел(неизменны)
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, 5, 15);//приватный конструктор по этому выводим дату через метод of который возвращяет конструктор
        System.out.println(ld1);
        ld1 = ld1.minusDays(5);// отняли пять дней там есть еще методы
        System.out.println(ld1);
        ld1 = ld1.plusYears(1);// прибавили 1 год
        System.out.println(ld1);
    }
}

class Calendar5 {
    //Сравнение времени или даты или времени с датами был до какого то дня
    //для всех Local
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        LocalDate ld2 = LocalDate.of(2013, Month.APRIL, 15);
        System.out.println(ld1.isAfter(ld2));//Сравнивает ld1 после ld2 ---------->true
        System.out.println(ld1.isBefore(ld2));//Сравнивает ld1 до ld2 ---------->false
    }
}

class Calendar6 {
    static void smenaDejurnogo(LocalDate nachalo, LocalDate konec, Period p) {
        LocalDate data = nachalo;
        while (data.isBefore(konec)) {
            System.out.println("Наступила дата " + data + ". Пора менять дежурного");
            data = data.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2017, Month.MAY, 31);
        Period p = Period.ofMonths(1);//Период класс который может передавать периуды (месяц день и тд) здесь месяц  не работает с LocalTime
        Period c = Period.ofWeeks(1);//Период класс который может передавать периуды (месяц день и тд) здесь неделя
        Period a = Period.of(1, 5, 21);
        smenaDejurnogo(nachalo, konec, p);
        Duration d = Duration.ofDays(2);//день для LocalDateTime или LocalTime не работает с LocalDate
        Duration g = Duration.ofHours(2);//час для LocalDateTime или LocalTime
        System.out.println(nachalo.getDayOfWeek());//можно вернуть название дня недели
        System.out.println(nachalo.getDayOfMonth());//можно вернуть число месяца и тд

        LocalTime lt = LocalTime.of(16, 40);
        System.out.println(lt.getHour());//возвращяем часы аналагично минуты
    }
}

class Calendar7 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate ld2 = LocalDate.of(2017, Month.MAY, 31);

        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;//форматирование даты (можно время и дату) для взоимодействия между компьюторами
        System.out.println(ld1.format(d1));
        System.out.println(ld1);

        LocalDateTime ldt2 = LocalDateTime.of(2016, 5, 25, 15, 30, 45);//дата часы минуты секунды
        System.out.println(ldt2);
        System.out.println(ldt2.format(DateTimeFormatter.ISO_WEEK_DATE));// произведет формат данных и выдаст 2016-W21-3  где W21 21 неделя в году и 25 число является 3 днем недели (среда)
    }
}

class Calendar8 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2016, Month.SEPTEMBER, 1);
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);//аналоги есть под время (ofLocalizedDateTime) есть еще и другие варианты формата FormatStyle.MEDIUM и тд
        System.out.println(ld1);//2016-09-01
        System.out.println(ld1.format(shortFormat));//уже пошли форматы 01.09.2016
    }
}

class Calendar9 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 5, 25, 15, 30, 45);//дата часы минуты секунды
        LocalDateTime ldt3 = LocalDateTime.of(2016, 5, 5, 5, 3, 5);//дата часы минуты секунды
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm:ss");//y-2016 yy-16 yyyy-2016 M-5 MM-05 MMM-мая(короткое написание) ММММ-(длинное напис) w-неделя ww-01 d-25 dd-25 h-3 hh-03 m-30 mm-30 s-45 ss-45 n-нанасекунда nnnnn-
        System.out.println(ldt2);//2016-05-25T15:30:45
        System.out.println(ldt2.format(f));//мая 25, 2016, 03:30
        System.out.println(ldt3);          //2016-05-05T05:03:05
        System.out.println(ldt3.format(f));//мая 05, 2016, 05:03:05
    }
}

class Calendar10 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, 5, 25, 15, 30, 45);//дата часы минуты секунды
        LocalTime lt = LocalTime.of(16, 40);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("01 02 2015", f);//переводим строку в класс LocalDate(парсинг)
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2013-01-13");//если писать строку в дефолдном виде, то можно не применять формат
        System.out.println(date2);
    }
}

class Calendar11 {
    static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    static void smena(LocalDateTime nachalo, LocalDateTime konec, Period p, Duration d) {
        LocalDateTime data = nachalo;
        while (data.isBefore(konec)) {
            System.out.print("Работа с: " + data.format(f1));
            data = data.plus(p);
            System.out.println(" До: " + data.format(f1));
            System.out.print("Отдыхаем с: " + data.format(f2));
            data = data.plus(d);
            System.out.println(" До: " + data.format(f2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt2 = LocalDateTime.of(2016, 5, 25, 15, 30, 45);//дата часы минуты секунды
        LocalDateTime ldt3 = LocalDateTime.of(2017, 5, 5, 5, 3, 5);//дата часы минуты секунды
        Period p = Period.ofMonths(1);//Период класс который может передавать периуды (месяц день и тд) здесь месяц  не работает с LocalTime
        Duration d = Duration.ofDays(2);//день для LocalDateTime или LocalTime не работает с LocalDate
        Duration g = Duration.ofHours(2);//час для LocalDateTime или LocalTime
        smena(ldt2, ldt3, p, d);
    }
}