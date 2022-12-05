package zadachi.Mashine;

public class MainAuto {
    public static void main(String[] args) {
      Auto auto = new Auto("Тесла", "Красная", new Wheel("Кирзачи"));


//        auto.setWheel(new Wheel("Наташа"));
        auto.turnRight();

        auto.getWheel().setName("Оля");
        auto.turnRight();

    }

}
