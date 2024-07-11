package Ycheba.Generik;

import java.util.ArrayList;

/*Параметраризированный метод
 */
class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(150);
        al1.add(20);
        al1.add(30);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
        System.out.println("-----------------------");
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Привет");
        al2.add("Пока");
        al2.add("Как дела");
        al2.add("Здрасте");
        String b = GenMethod.getSecondElement(al2);
        System.out.println(b);
    }

}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){ //в параметре будет ArrayList<T> какого то типа данных
        // Т перед названием метода T getSecondElement это то что мы вернем, <T> значит что мы используем джинерик в методе
        return al.get(1);
    }
}
