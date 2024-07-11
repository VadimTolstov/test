package Ycheba.Generik;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Привет", 20);
        System.out.println("Значение прары: valuel1 = " + pair1.getFirstValue() +
                           ", valuel2 = " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(156, 3.14);
        System.out.println("Значение прары: valuel1 = " + pair2.getFirstValue() +
                           ", valuel2 = " + pair2.getSecondValue());

        OtherPair<String> otherPair = new OtherPair<>("Ok", "Paka");//один дженерик 2 параметра в конструкторе
        System.out.println("В otherPair valuel1 = " + otherPair.getFirstValue() + ", valuel2 = " + otherPair.getSecondValue());
    }
}

//c двумя плейсхордами <V1, V2>
class Pair<V1, V2> {
    private V1 valuel1;
    private V2 valuel2;

    public Pair(V1 valuel1, V2 valuel2) {
        this.valuel1 = valuel1;
        this.valuel2 = valuel2;
    }

    public V1 getFirstValue() {
        return valuel1;
    }

    public V2 getSecondValue() {
        return valuel2;
    }
}

//с одним плейсходером но двумя переменными
class OtherPair<V> {
    private V valuel1;
    private V valuel2;

    public OtherPair(V valuel1, V valuel2) {
        this.valuel1 = valuel1;
        this.valuel2 = valuel2;
    }

    public  V abc(V val){
        return val;
    }

    public V getFirstValue() {
        return valuel1;
    }

    public V getSecondValue() {
        return valuel2;
    }
}
