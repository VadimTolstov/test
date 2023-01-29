package Ycheba.ForWhile;

class ContinueMetka {
    // Применение инструкции continue с меткой

    public static void main(String args[]) {
        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nВнешний цикл: проход " + i +
                    ", внутренний цикл: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outerloop; // продолжение внешнего цикла
                System.out.print(j);


            }
        }
    }
}