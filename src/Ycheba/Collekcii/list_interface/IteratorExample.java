package Ycheba.Collekcii.list_interface;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator это повторитель с помощью него мы можем пробежать по листу
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Ivan");
        arrayList.add("Mariya");
        arrayList.add("Kolya");
        arrayList.add("Elena");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){ // hasNext - проверяет есть ли спереди элемент да тогда true и первым в листе будет Zaur
            System.out.println(arrayList);//просто выводим массив
            iterator.next(); // выбераем  элемент-------------------------
            iterator.remove(); // удаляем выбранный элементи -------------------
        }
        System.out.println(arrayList);
    }
}
