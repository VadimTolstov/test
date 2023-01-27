package Ycheba.Biblioteci.Calendar;

import java.text.SimpleDateFormat;
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

        System.out.println("Сейчас №1  " + hourOfDay + ":" + minute + ":" + second + " Дата " + dayOfMonth +"."+(month+1)+"."+year+" Эра "+ era);

    //А теперь посмотрим, как это сделать проще. Для этого у нас есть специальный класс, который позволяет нам сформировать время просто и элегантно:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");// тоже самое что выше но проще
        //В конструктор мы передаем паттерн, на основании которого будет форматироваться наш объект:


        System.out.println("Сейчас №2  " + dateFormat.format(calendar.getTime()));
    }
}