package Ycheba.multithreading;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*CopyOnWriteArrayList имплементирует интерфейс List.
CopyOnWriteArrayList следует использовать тогда, когда вам нужно добиться потокобезопасности, у вас небольшое
количество операций по изменению элементов и большое количество по их чтению. При изменении элемента создается копия листа.

CopyOnWriteArraySet - работает аналогично CopyOnWriteArrayList
 */
public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Заур");
        list.add("Олег");
        list.add("Сергей");
        list.add("Иван");
        list.add("Игорь");
        System.out.println(list);

        Runnable runnable1 = () -> {
            Iterator<String> iterator = list.iterator();//итератору передалось состояние этой коллекции на момент создания итератора по этому он выводит то что запомнил
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(4);//здесь создалась новая копя коллекции
            list.add("Елена");// и здесь создалась новая копя коллекции
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);//здесь выводим последнею копию листа
    }
}
