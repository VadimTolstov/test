package Ycheba.ForWhile;

public class IfForString {
    public static void main(String[] args) {
        // System.out.println(countChars("Etse", 'E'));
//        System.out.println(encrypt("slnqs"));
//        System.out.println(encrypt2("slnqs"));
        System.out.println(greaterThan("Q","Q"));
    }

    public static int countChars(String str, char ch) {

        int i = 0;
        int count = 0;
        var lov = Character.toLowerCase(ch);
        while (i < str.length()) {
            if (str.toLowerCase().charAt(i) == ch) {
                count++;
            } else if (str.toUpperCase().charAt(i) == ch) {
                count++;
            }

            i++;
        }
        // END
        return count;
    }

    //аналог записи ниже
    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            var nextSymbol = (i + 2 > str.length()) ? "" : str.substring(i + 1, i + 2);
            result = result + nextSymbol + str.charAt(i);
        }
        return result;
    }

    //Аналог метода выше, меняет местами символы
    public static String encrypt2(String str2) {
        String encrypt = "";
        int i = 0;

        if (str2.length() % 2 == 0) {
            while (i < str2.length() - 1) {
                encrypt = encrypt + str2.charAt(i + 1) + str2.charAt(i++);
                i++;

            }
        } else {
            while (i < str2.length()) {

                if (i < str2.length() - 1) {
                    encrypt = encrypt + str2.charAt(i + 1) + str2.charAt(i++);
                } else encrypt = encrypt + str2.charAt(i);

                i++;
            }
        }
        return encrypt;
    }


    public static boolean greaterThan(String l1, String l2) {
        return (Counter.bigLettersCount(l1) > Counter.bigLettersCount(l2));
    }
    public class Counter {
        public static int bigLettersCount(String text) {
            var result = 0;

            for (var i = 0; i < text.length(); i++) {
                var current = text.charAt(i);
                if (Character.toUpperCase(current) == current) {
                    result += 1;
                }
            }

            return result;
        }
    }
}
