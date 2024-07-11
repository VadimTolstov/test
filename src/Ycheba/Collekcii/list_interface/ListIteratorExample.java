package Ycheba.Collekcii.list_interface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


//.hasNext() проверяет есть следующий символ
//.hasPrevious() проверяет есть предыдущий символ

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {//toCharArray преубразует String в масив чаров
            list.add(ch);//
        }
        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();//начнет итерацию с начало
        ListIterator<Character> reverseIterator = list.listIterator(list.size());//начнет итерацию с конца
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {//проверяет iterator.hasNext() есть следующий симвло
            // если да сравним (if (iterator.next() != reverseIterator.previous())) его с reverseIterator.hasPrevious() который проверяет есть ли предыдущий символ
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром ");
        }
    }
}
