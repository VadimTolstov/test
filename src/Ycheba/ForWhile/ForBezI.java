package Ycheba.ForWhile;

class ForBezI {
    // Пропуск отдельных составляющих в определении цикла for

    public static void main(String args[]) {
        int i;
        i = 0; // Выносим инициализацию за пределы цикла инициализирующее
        for (; i < 10; ) {
            System.out.println("Проход #" + i);
            i++; // Инкрементирование переменной цикла
        }
    }
}