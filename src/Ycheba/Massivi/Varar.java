package Ycheba.Massivi;

/*Метод принимающий массивы и кладет их в массив
 * */
public class Varar {
    public static String[] abs(String[]... array1) {
        int length = 0; //для определения длины массива.
        for (String[] array2 : array1) { //перебираем все массивы и считаем далее все их длины
            length += array2.length;//суммируем длины всех массивов
        }

        int count = 0;
        String[] target = new String[length];
        for (String[] array2 : array1) {
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abs(new String[]{"ok", "poka", "privet"}, new String[]{"ok", "hello", "bye"});

        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {
                    target[i] = null;
                }
            }
        }
        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
