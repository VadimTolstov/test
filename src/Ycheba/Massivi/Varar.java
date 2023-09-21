package Ycheba.Massivi;

/*Метод принимающий массивы и кладет их в массив урок 21 Java (Джава) для начинающих: с нуля до сертификата Oracle
 * */
public class Varar {
    public static String[] abs(String[]... array1) { //метод принимает двумерный массив
        int length = 0; //для определения длины массива.
        for (String[] array2 : array1) { //перебираем все массивы и считаем далее все их длины
            length += array2.length;//суммируем длины всех массивов
        }

        int count = 0;
        String[] target = new String[length]; //создаем массив в который все перезапишем
        for (String[] array2 : array1) {//элемент двумерного массива [][] array1 является одномерный массив String[] array2
            for (String s : array2) {//элементов одномерного массива является тип данных в данном случаи String s
                target[count] = s;
                count++;
            }
        }
        return target; //и вернем массив
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
