package Ycheba.Collekcii.list_interface.paketi;

public class WeightBox extends Box {
    private double weight;

    public WeightBox() {
        this.weight = 10;
    }

    public WeightBox(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public WeightBox(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(weight);
    }

    public static void main(String[] args) {
        WeightBox pack = new WeightBox(2, 2, 2, 2);
        pack.showInfo();
        Box box = new Box(10);
        box.showInfo();
    }
}
