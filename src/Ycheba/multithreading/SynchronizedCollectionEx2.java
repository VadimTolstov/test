package Ycheba.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* Так синхронизируется данные
в данном случаи при использования обычного листа будет вылетать ошибка при удалении данных
Работу Iterator нужна заключать в synchronized блоке
Iterator - подвержены сбоям в многопоточном приложении, для безопасности нужно блокировать весь лист для изменений
что бы потоки работали по очереди.
 */
public class SynchronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        List<Integer> synchList = Collections.synchronizedList(arrayList);//добавляем данные в synchronizedList

        Runnable runnable1 = () -> {
            synchronized (synchList) {//ставим лок что бы не получить ошибку
                Iterator<Integer> iterator = synchList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = () ->
                synchList.remove(10);// при удалении данных будет вылетать ошибка

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}
