package zadachi.TViPylt;

class TVset {
    int channel = 5;
    boolean isOn;

    public String toString() {
        if (!isOn){
            return "Телевивоз выключен";
        }
        return "Канал " + channel + " показывает ТВ сейчас";
    }
}
