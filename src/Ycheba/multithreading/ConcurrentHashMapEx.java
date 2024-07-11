package Ycheba.multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*
ConcurrentHashMap - имплеменирует интерфейс ConcurrentMap, который в свою очередь происходит от интерфейса Map
В ConcurrentHashMap любое количество потоков может читать элементы не блокируя его.
В ConcurrentHashMap, благодаря его сегментированию, при изменении какого-либо элемента блокируется только bucket (сегмент),
в котором он находится.
В ConcurrentHashMap ни key, ни value не могут быть null.
 */
public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();// создания ConcurrentHashMap
        map.put(1, "Заур");
        map.put(2, "Олег");
        map.put(3, "Сергей");
        map.put(4, "Иван");
        map.put(5, "Игорь");
        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();//у map нет итератора по этому получают .keySet() и у него уже есть .iterator()
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next(); // получаем ключ элемента
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "Елена");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
