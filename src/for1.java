public class for1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 1) {
            System.out.println("Строка" + i);
        }
    }
}
// Прогоняет цикл указанное в условие колличество раз
// Начальная i = 0, с каждым пройденным циклом I увеличивается
// на 1 пока цикл не достигнит 100
/*   for (int i = 0; i < 100; i += 10) {
        System.out.println("Строка " + i);
        if (i == 50) {
        break;
        }
        }
        Если цикл надо сотановить на 50 прогоне ставим в конце break
 */
/* for (int i = 0; i < 100; i += 10) {
   if (i == 50) {
       continue;
   }
   System.out.println("Строка " + i);
}
Если надо пропустить один из моментов прогонов, пример пропустится
50 цикл и программа продолжит прогонять дальше пока недостигнит условия
Ну а что, если нам не нужно выходить из цикла, а нужно просто пропустить
один проход (итерацию)? Для этого у нас есть оператор continue:
 */