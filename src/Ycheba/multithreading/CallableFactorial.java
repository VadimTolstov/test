package Ycheba.multithreading;

import java.util.concurrent.*;

/* Callable, также как Runnable, представляет собой определенное задание, которое выполняется потоком.
В отличии от Runnable Callable:
 - имеет return type не void;
 - может выбрасывать Exception.
.submit - Метод submit передает наше задание (task) в thread poll, для выполнения его одним из потоков, и возвращает
тип Future, в котором и хранится результат выполнения нашего задания.
Метод get позволяет получить результат выполнения нашего задания из объекта Future.

 */
public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(8);
        Future<Integer> future = executorService.submit(factorial2);
        try {
            factorialResult = future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
            ;
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial2 implements Callable<Integer> {

    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Вы ввели не верное число!!");//здесь выбрасываем ексепшен если нужно
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}