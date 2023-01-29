package Ycheba.ForWhile;

class ForI {
    // Пропуск отдельных составляющих в определении цикла for

    public static void main(String args[]) {
        int i;
        for (i = 0; i < 10; ) { //Отсутствует итерационное выражение
            System.out.println("Проход #" + i);
            i++; // инкрементирование переменной цикл
        }
    }
}