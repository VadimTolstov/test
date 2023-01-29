package stroki;

import java.util.Scanner;

public class StrociProvercaImeni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }

    private static String formatName(String name) {
        String[] words = name.trim().split(" ");
        sortByLength(words);
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + "";
            }
        }
        return result;
    }

    private static void sortByLength(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }
    }
}
    /* Напишите метод, который будет проверять, корректно ли пользователь
            ввёл полное имя. Не все написанное в методе main может быть
            вам понятно, и это нормально (позднее мы будем разбирать эти
            конструкции), ваша задача — сосредоточиться на написании метода.

            Нужно будет проверить, что во введённой строке 3 слова (если имя,
            фамилия или отчество пишутся через дефис, то это считается за одно
            слово). Если пользователь ввёл имя некорректно, например в нём 2 или
            4 и более слов, то вывести сообщение с просьбой ввести имя ещё раз.

            Не забудьте удалить лишние пробелы в начале и конце строки.
            Добавьте некоторые улучшения в метод из предыдущего задания.
            Сделайте так, чтобы имя пользователя форматировалось по следующим правилам:
            Самое короткое слово в имени должно быть на первом месте,
            а самое длинное — на последнем, то есть отсортируйте слова в имени по длине.
            Сделайте так, чтобы каждое слово в имени было написано с большой буквы.*/
