package Ycheba.Metod;

/*Напишите код, который берет данные из переменной name и выполняет их капитализацию.
 В программировании так называют операцию, которая делает заглавной первую букву в слове,
  а все остальные переводит в нижний регистр. Например: heXlet => Hexlet. Выведите на экран получившийся результат.*/

public class App {
    public static void main(String[] args) {

        var name = "heXlEt";

        //Берем первый символ из строки и переводим его в верхний регистр
        var capitalized = name.substring(0, 1).toUpperCase()
                          //потом берем остальную чатьс строки и переводим в нижний регистр
                          + name.substring(1).toLowerCase();
        System.out.println(capitalized);

    }
}
