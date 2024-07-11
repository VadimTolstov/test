package Ycheba.stream;

import java.util.stream.Stream;

/* Стрим после обработке нельзя его переиспользовать тот же стрим
distinct() - возвращяет только уникальные значения стрима сравнивает через иквилс!!!
stream5.count()- вернет Лонг и колличество элементов в стриме
stream5.distinct().count() - вернет колличество уникальных значений
peek(System.out::println) - помогает просмотреть (вывеси данные) что происходит на разных этапах метода чейнинга
 */
public class Test6  {
    public static void main(String[] args) {
        Stream<Integer> stream5 = Stream.of(1,2,3,4,4,3,2,1,5,6,6);
        System.out.println(stream5.count());
        System.out.println("-------------------------------------------------------------");

        Stream<Integer> stream6= Stream.of(1,2,3,4,4,3,2,1,5,6,6);
       stream6.distinct().forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");

        Stream<Integer> stream7 = Stream.of(1,2,3,4,4,3, 2, 1, 5, 6, 6);
        System.out.println(stream7.distinct().peek(System.out::println).count());
    }
}
