public class doWhile {
    public static void main(String[] args) {
        int i = 10;
        do {
            i--;
        } while (i > 10);
        System.out.println("Проход i =" + i);
    }
}
// Выполняет цикл пока не выполнится постусловие,
// если условие не выполнимо сделает 1 прогон