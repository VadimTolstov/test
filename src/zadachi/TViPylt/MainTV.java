package zadachi.TViPylt;

public class MainTV {

    public static void main(String[] args) {
        TVset tv = new TVset();
        Remote remote = new Remote();
        remote.setTvset(tv);
        System.out.println(tv);
        remote.turnOn();
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);
    }
}
