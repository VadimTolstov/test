package massiv;
import java.util.Arrays;
import java.util.Comparator;

class ComparatorByLength implements Comparator<String> {

    @Override
    public int compare(String arg0, String arg1) {
        // считаем, что null-ссылки "больше всех"
        // при сортировке они должны уйти в конец
        if (arg0 == null)
            return 1;
        if (arg1 == null)
            return -1;
        // точно две не-null строки -- сравниваем по длине
        return arg0.length() - arg1.length();
    }
}


class Main {

    public static void main(String[] args) {
        String[] array = {"Баркас","Лес", "Арбуз", "Звезда", "Лимон", "Дерево","Ёлка"};
         Arrays.sort(array, new ComparatorByLength());
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}//Ё это проблемма сортировки испльзуй лудше е
