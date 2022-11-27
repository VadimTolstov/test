package stroki;

public class Sravneniestok {
    public static void main(String[] args) {
        String a = "Иван Иванов";
        String b = "иван иванов";
        String c = new String("Иван Иванов");
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a==b);
        if (a.equalsIgnoreCase(b)==true)
            System.out.println("Выберите другое имя");
        else
            System.out.println("Отличное имя!");
    }
}
