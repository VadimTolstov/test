package Ycheba.Collekcii.OcheredStek.Comparator;


import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Objects;

/*Преимущество данного метода в том, что теперь мы вызываем метод не у самого сравниваемого
 объекта, а у любого объекта, имплементирующего интерфейс Comparator. Плюс в этом:
 теперь мы можем написать сколь угодно много способов сравнения объектов одного типа.
 */
class Product  {

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
        Ycheba.Collekcii.OcheredStek.Comparator.Product product = (Ycheba.Collekcii.OcheredStek.Comparator.Product) o;
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
    //Давайте создадим две имплементации Comparator и сравним продукты, используя их:
    //Первый Comparator сравнивает продукты по имени в алфавитном порядке по возрастанию,
    public static class NameComparator implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    //а второй — по серийному номеру в арифметическом порядке но по уменьшению чисел.
    public static class SerialNumberComparator implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return Long.compare(o1.getSerialNumber(), o2.getSerialNumber());
        }
    }
}