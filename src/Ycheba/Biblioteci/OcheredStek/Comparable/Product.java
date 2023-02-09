package Ycheba.Biblioteci.OcheredStek.Comparable;

import java.time.LocalDateTime;
import java.util.Objects;

/*Перед тем как разобраться с ошибкой, давайте подумаем, почему мы не можем добавить объект класса Product в TreeSet?
 Все просто: класс этого объекта (в данной реализации) является несортируемым. И действительно, как Java может понять,
  как мы хотим сортировать этот объект в коллекции? По дате создания в порядке убывания или, может, по серийному номеру
   в порядке возрастания? А может по тому и другому сразу?
Для определения логики сортировки объекта служит интерфейс java.lang.Comparable.

 */
class Product implements Comparable<Product> {

    private final String brand;
    private final String name;
    private final long serialNumber;
    private final LocalDateTime creationDate;

    public Product(String brand, String name, long serialNumber, LocalDateTime creationDate) {
        if (brand == null || name == null || serialNumber == 0 || creationDate == null) {
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.name = name;
        this.serialNumber = serialNumber;
        this.creationDate = creationDate;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return serialNumber == product.serialNumber &&
               brand.equals(product.brand) &&
               name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name, serialNumber);
    }

    @Override
    public String toString() {
        return "Product{" +
               "brand='" + brand + '\'' +
               ", name='" + name + '\'' +
               ", serialNumber=" + serialNumber +
               ", creationDate=" + creationDate +
               '}';
    }

    /*Сейчас мы имплементировали интерфейс Comparable и в методе compareTo() сказали,
    что будем сравнивать бренды по возрастанию (класс String тоже имплементирует данный интерфейс,
    строки сортируются в алфавитном порядке по возрастанию).
         */

    @Override
    public int compareTo(Product o) {
        return brand.compareTo(o.brand);
    }
}
/*Очень важно иметь согласованные между собой методы equals() и compareTo(),
то есть объекты обязательно должны быть равны между собой в случае, если метод compareTo() возвращает 0.
 */