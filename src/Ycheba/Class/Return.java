package Ycheba.Class;

class Return {
    public static void main(String[] args) {


        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) return; // завершение цикла после достижения значения 5
            System.out.println(i);// и осущетвлится возрат из метода

        }
    }
}