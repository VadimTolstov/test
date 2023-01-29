package Ycheba.Massivi;

// Среднее арифметическое 10 значений типа double
class Avg {
    public static void main(String[] args) {
        double[] massiv = new double[10];      //пытался массив заполнить double
        double summ = 0;
        for (double i = 0.12; i < massiv.length; i++)
            massiv[(int) i] = i ;

        for (int i = 0; i < massiv.length; i++){
            summ = summ + massiv[i];
            System.out.println(summ);}


        System.out.println("Среднее значение : " + summ / massiv.length);
        System.out.println();

        // пример из книги
        double nums[] = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8,
                9.9, 10.1};
        double sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        System.out.println(sum);
        System.out.println("Среднее значение: " + sum / nums.length);

    }

}