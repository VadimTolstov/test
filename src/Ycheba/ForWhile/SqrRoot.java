package Ycheba.ForWhile;

// Вывод квадратных корней чисел от 1 до 99
// вместе с ошибкой округления
 class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1; num < 100; num++) {
            sroot =  Math.sqrt(num);// из за округления ошибка в расчетах
            System.out.println("Корень квадратный из " + num + " равен " + sroot);
            //Вычислить ошибку округления
            rerr = num - (sroot*sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();


        }
    }
}
