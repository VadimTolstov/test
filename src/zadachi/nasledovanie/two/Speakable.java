package zadachi.nasledovanie.two;

interface Speakable {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}
