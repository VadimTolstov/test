package zadachi.TViPylt;

class TVset2  {

    private int channel = 5;
    private boolean isOn;
    private Remote remote = new Remote();

    public Remote getRemote() {
        return remote;
    }

    class Remote {

        public void setChannel(int channel) {
            TVset2.this.channel = channel; // обращяемся к обьектам класса ТВ2
        }

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
        }
    }

    public String toString() {
        if (!isOn) {
            return "Телевизор выключен";
        }
        return "Канал " + channel + " показывает сейчас";
    }
}

public class Main2TV {

    public static void main(String[] args) {
        // покупаем телевизор
        TVset2 tv = new TVset2();
      //  TVset2.Remote remote = tv.new Remote(); можно так без getRemote(); 2 вариант
        // и берем из коробки новенький пульт (он входит в комплект!)
        TVset2.Remote remote = tv.getRemote();//можно так с get 1 вариант
        System.out.println(tv);
        // и сразу начинаем пользоваться
        remote.turnOn();
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);
    }
}