package Ycheba.Massivi;

import java.util.Arrays;

public class MassivsPerebori {
    public static void main(String[] args) {
        //Произведение всех чисел в списке
        int[] numbers = {2, 3, 4, 5};
        int product = getProductRecursive(numbers, 0);
        System.out.println("Product: " + product);

        //Заглавные слова в массиве:
        String[] words = {"foo", "bar", "world"};
        String[] capitalizedWords = capitalizeWordsRecursive(words, 0);
        System.out.println("Capitalized words: " + Arrays.toString(capitalizedWords));

        //Поиск самого большого элемента в массиве
        int[] numbers2 = {5, 8, 2, 10, 3};
        int highestElement = findHighestElementRecursive(numbers2, 0, Integer.MIN_VALUE);
        System.out.println("Highest element: " + highestElement);

        //Добавление налога к зарплате
        double[] salaries = {1000.0, 2000.0, 3000.0};
        double[] newSalaries = addTaxRecursive(salaries, 0);
        System.out.println("New salaries: " + Arrays.toString(newSalaries));
    }

    //    Произведение всех чисел в списке
//    Первая задача, которую мы решим, — найти произведение всех чисел в списке. В этом нам поможет
//    рекурсивная функция getProductRecursive, которая умножает каждый элемент на произведение остальных
//    элементов, пока не будет достигнут конец списка. Для наглядности ознакомьтесь с примером кода,
//    демонстрирующим реализацию этой функции:
    public static int getProductRecursive(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return 1;
        } else {
            return arr[index] * getProductRecursive(arr, index + 1);
        }
    }

    //    Заглавные слова в массиве:
//    Далее мы рассмотрим рекурсивную функцию для написания всех слов в массиве с заглавной буквы.
//    Мы определим функцию capitalizeWordsRecursive, которая преобразует каждое слово в верхний регистр с помощью
//    метода toUpperCase и рекурсивно вызывает себя для обработки оставшихся слов в массиве. Логика и использование
//    этой функции показаны на фрагменте кода:
    public static String[] capitalizeWordsRecursive(String[] words, int index) {
        if (index < 0 || index >= words.length) {
            return new String[0];
        } else {
            String word = words[index];
            String capitalizedWord = word.toUpperCase();
            String[] remainingWords = capitalizeWordsRecursive(words, index + 1);
            String[] result = new String[remainingWords.length + 1];
            result[0] = capitalizedWord;
            System.arraycopy(remainingWords, 0, result, 1, remainingWords.length);
            return result;
        }
    }

    //    Поиск самого большого элемента в массиве
//    В этом разделе перед нами стоит проблема поиска самого большого элемента в массиве с помощью рекурсии.
//    Мы определим рекурсивную функцию findHighestElementRecursive, которая сравнивает каждый элемент с текущим
//    наибольшим значением и обновляет его, если найден элемент, который его превышает.
//    Вот пример кода, иллюстрирующий ее использование:
    public static int findHighestElementRecursive(int[] arr, int index, int highest) {
        if (index < 0 || index >= arr.length) {
            return highest;
        } else {
            int currentElement = arr[index];
            if (currentElement > highest) {
                highest = currentElement;
            }
            return findHighestElementRecursive(arr, index + 1, highest);
        }
    }
    //    Добавление налога к зарплате
//    И наконец, давайте решим задачу добавления 10% налога к каждой зарплате в массиве.
//    Для этого определим рекурсивную функцию addTaxRecursive, которая вычисляет новую зарплату, добавляя налог,
//    и рекурсивно вызывает себя для обработки оставшихся зарплат.
//    Перед вами полный пример кода для демонстрации ее функциональности:
    public static double[] addTaxRecursive(double[] salaries, int index) {
        if (index < 0 || index >= salaries.length) {
            return new double[0];
        } else {
            double salary = salaries[index];
            double newSalary = salary + (0.1 * salary);
            double[] remainingSalaries = addTaxRecursive(salaries, index + 1);
            double[] result = new double[remainingSalaries.length + 1];
            result[0] = newSalary;
            System.arraycopy(remainingSalaries, 0, result, 1, remainingSalaries.length);
            return result;
        }
    }
}
