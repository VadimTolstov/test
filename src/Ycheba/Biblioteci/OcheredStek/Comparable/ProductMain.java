package Ycheba.Biblioteci.OcheredStek.Comparable;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

class ProductMain {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();
        set.add(new Product("СуперБренд", "Колбаса", 3435425245L, LocalDateTime.now()));
        set.add(new Product("ЛучшийБренд", "Сыр", 434323434L, LocalDateTime.now()));
        set.add(new Product("ХорошийБренд", "Сыр", 4343111111L, LocalDateTime.now()));
        for (Product product : set) {
            System.out.println(product.getBrand());
        }
    }
}
