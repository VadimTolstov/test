package Ycheba.nested_classes.local_inner_class;

/*
локальный класс виден только внутри блока где его создали к примеру конструктор или метод
не может быть статичным
может обращятся даже к приватным элементам внешнего класса
имеет доступ к элементам блока, в котором он написан при условии что они final или инициализированы
 */
public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    private int a = 10;
    public void getResult() {
        String s = "Привет";
        class Delenie {
            private int delimoe;
            private int delitel;

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println(a);// выводим переменную внешенго класса
                System.out.println(s);// выводим переменную блока
                return delimoe % delitel;
            }

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());

    }
}