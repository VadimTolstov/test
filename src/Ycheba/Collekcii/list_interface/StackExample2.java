package Ycheba.Collekcii.list_interface;

import java.util.Stack;

//.push("Zaur"); вставляет элемент на самый верх нашего стека (это в конец листа значит)
//.pop() выводит элемент который на самом верху и удаляет его (применение к пустому стеку выдаст ошибку)
//.peek() возвращяет элемент на самомо верху стека но не удаляет его
public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");//-----------------------
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katy");
        System.out.println(stack);
        System.out.println(stack.pop());//-----------------------------------
        System.out.println(stack);
        System.out.println("Пеек " + stack.peek());//-----------------------------------
        while (!stack.isEmpty()) { //пока стек не пуст выводи нам этот элемент и удали его
            System.out.println("удалим элемент в цикле " + stack.pop());
            System.out.println(stack);
        }
    }
}
