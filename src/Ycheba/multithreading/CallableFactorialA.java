package Ycheba.multithreading;

import java.util.concurrent.*;

/* Callable, также как Runnable, представляет собой определенное задание, которое выполняется потоком.
В отличии от Runnable Callable:
 - имеет return type не void;
 - может выбрасывать Exception.
.submit - Метод submit передает наше задание (task) в thread poll, для выполнения его одним из потоков, и возвращает
тип Future, в котором и хранится результат выполнения нашего задания.
Метод get позволяет получить результат выполнения нашего задания из объекта Future.

future.isDone() - проверяем закончилась ли задача или нет
 */
public class CallableFactorialA {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial3 factorial3 = new Factorial3(8);
        Future<Integer> future = executorService.submit(factorial3);
        try {
            System.out.println(future.isDone());//проверяем закончилась ли наша задача
            System.out.println("Хотим получить результат");
            factorialResult = future.get();
            System.out.println("Получили результат");
            System.out.println(future.isDone());
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

class Factorial3 implements Callable<Integer> {

    int f;

    public Factorial3(int f) {
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
            Thread.sleep(1000);
        }
        return result;
    }
}