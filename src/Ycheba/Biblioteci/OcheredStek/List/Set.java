package Ycheba.Biblioteci.OcheredStek.List;

class Set extends Object {

    //убераем КИА и Выводим без повторений машины БМВ и Тайота, У таеты меняем onSale на тру в Листе
    private String brand;
    private String name;
    private boolean onSale;

    public Set(String brand, String name, boolean onSale) {
        this.brand = brand;
        this.name = name;
        this.onSale = onSale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {

        return "Car{ " +
               "brand = '" +brand + '\'' +
               ", name = '" + name + '\'' +
               ", onSale = " + onSale + '}';
    }


}
