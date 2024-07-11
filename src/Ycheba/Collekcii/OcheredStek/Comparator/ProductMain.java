package Ycheba.Collekcii.OcheredStek.Comparator;



import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

class ProductMain {
    public static void main(String[] args) {

        //Обратите внимание, что у объекта new SerialNumberComparator() был вызван дополнительно метод reversed(),
        // который возвращает новый компаратор, у которого инвертирована логика сортировки, в данном случае
        // сортировка типа long будет не в порядке возрастания чисел, как в обычном компараторе, а наоборот.

        Set<Product> products = new TreeSet<>(new Product.SerialNumberComparator().reversed());
        products.add(new Product("СуперБренд", "Колбаса", 1L, LocalDateTime.now()));
        products.add(new Product("ЛучшийБренд", "Сыр", 2L, LocalDateTime.now()));

        for (Product product : products) {
            System.out.println(product.getSerialNumber());
        }

        for (Product product : products) {
            System.out.println(product.getName());
        }

        System.out.println();

        Set<Product> productc = new TreeSet<>(new Product.NameComparator());
        productc.add(new Product("СуперБренд", "Колбаса", 1L, LocalDateTime.now()));
        productc.add(new Product("ЛучшийБренд", "Сыр", 2L, LocalDateTime.now()));


        for (Product product : productc) {
            System.out.println(product.getSerialNumber());
        }

        for (Product product : productc) {
            System.out.println(product.getName());
        }


    }
}