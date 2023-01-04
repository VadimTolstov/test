package Ycheba.ForWhile;

// Вычисление целых степеней числа 2
 class WhileStepen {
    public static void main(String args[]) {
        int e;
        int result;
        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                System.out.print(e+",");// е крутит цикл вайт пока не станет равен нулю
                e--;// потом выводится результат прогона и возращается к циклу форт
            }
            System.out.println("\n2 в степени " + i +
                    " равно " + result);

        }
    }
}