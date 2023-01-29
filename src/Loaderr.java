public class Loaderr {
    private static int source = 30;
    private static int receiver = 0;

    public static void main(String[] args) {
        while (source > 0) {
            source--;
            if (source % 10 != 0 ) {
                receiver++;
            }
            System.out.println(source);
            System.out.println(receiver);
        }

    }
}
/* Из ведра объемом 30 литров нужно перелить воду в пустое ведро.
Каждый десятый литр проливается мимо.
Вывести процесс перелива в консоль — в первом ведре количество уменьшается,
во втором увеличивается.
 */