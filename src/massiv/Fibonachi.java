package massiv;
import java.util.Arrays;
public class Fibonachi {
    public static int[] numbers = new int[30];

    public static void main(String[] args) {
        numbers[0] = numbers[1] = 1;
        for (int i = 2, stop = numbers.length; i < stop; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        System.out.println(Arrays.toString(numbers));
    }
}

/*
В классе Main объявлен массив numbers. Заполните его весь (30 ячеек) числами Фибоначчи.
Числа Фибоначчи определяются так: первые два числа равны единице, а каждое последующее —
сумме двух предыдущих. Начало последовательности выглядит так: 1, 1, 2, 3, 5, 8, 13, 21, …
 */