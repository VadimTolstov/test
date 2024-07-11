package Ycheba.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Collections.synchronizedList(new ArrayList<>()) - создание коллекции для многопоточности
 */
public class SynchronizedCollectionEx1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());// вот так создается синхронизированный лист
        Runnable runnable = () -> {
            synchList.addAll(source);
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}
