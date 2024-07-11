package Ycheba.enums;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(Weekdays.MONDAY);
        today.daysInfo();
        Weekdays w = Weekdays.FRIDAY;
        System.out.println(today.weekDays);
        System.out.println(Weekdays.MONDAY.equals(Weekdays2.MONDAY));
        Weekdays w15 = Weekdays.valueOf("MONDAY"); // получаем одно значение
        System.out.println(w15);
        Weekdays [] array = Weekdays.values();
        System.out.println(Arrays.toString(array)); // получаем массив значений
    }
}

enum Weekdays {
    MONDAY("Плохое"),
    TUESDAY("Плохое"),
    WEDNESDAY("так себе"),
    THURSDAY("так себе"),
    FRIDAY("хорошее настроение"),
    SATURDAY("отличное настроение"),
    SUNDAY("хорошее настроение");

    private String mood;

    private Weekdays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today {
    Weekdays weekDays;

    public Today(Weekdays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY, THURSDAY, TUESDAY, WEDNESDAY, FRIDAY -> System.out.println("Иди на работу ");
            case SUNDAY, SATURDAY -> System.out.println("Можно отдыхать ");
        }
        System.out.println("Настроение в этот день: " + weekDays.getMood());
    }
}

enum Weekdays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}