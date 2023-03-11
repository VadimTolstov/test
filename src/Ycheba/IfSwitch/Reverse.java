package Ycheba.IfSwitch;

//Общая идея переворота состоит в следующем — нужно брать символы по очереди с начала строки и соединять их
//в обратном порядке. Давайте проверим, как это работает:
//Важно прочувствовать, как собирается сама строка — каждый следующий символ прикрепляется к результирующей строке
// слева, и в итоге строка оказывается перевернута.

public class Reverse {
    public static void main(String[] args) {
        System.out.println(Reverse.reverse("Приветик"));
    }
    public static String reverse(String str) {
        var i = 0;
        // Нейтральный элемент для строк — это пустая строка
        var result = "";
        while (i < str.length()) {
            // Соединяем в обратном порядке
            result = str.charAt(i) + result;
            i += 1;
        }

        return result;
    }

//    var name = "Bran";
//App.reverse(name); // "narB"
//// Проверка нейтрального элемента
//App.reverse(""); // ""
}
