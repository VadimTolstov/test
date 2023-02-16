package Ycheba.Metod;

/*сформировать адрес страницы в интернете на основе введенного
 пользователем названия статьи. Такая задача часто возникает при
  публикации статей в блогах. Подобные адреса выглядят так:
  https://ru.hexlet.io/blog/posts/iz-vahtovika-v-programmirovanie  */

class ChepochkiMetoda {
    public static void main(String[] args) {
        // Название, введенное пользователем. Для простоты на английском
        var name = " How much is the fish?   \n";
// вырезаем концевые пробелы и перенос строки
        name = name.trim();
// Удаляем вопрос
        name = name.replace("?", "");
// Заменяем пробелы на дефис
        name = name.replace(" ", "-");
// Переводим в нижний регистр
        name = name.toLowerCase();
        System.out.println(name); // => how-much-is-the-fish

        //Этот шаблон можно упростить, убрав промежуточное перезаписывание переменной:
        var name2 = "Woit much is the fish?  \n ";
        name2 = name2.trim().replace("?", "").replace(" ", "-").toLowerCase();
        System.out.println(name2);
    }
}
