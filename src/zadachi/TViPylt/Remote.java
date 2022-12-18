package zadachi.TViPylt;

class Remote {
    // храним ссылку на телевизор, которым управляем
    private TVset tvSet;

    // связываем телевизор с пультом
    public void setTvset(TVset tvSet) {
        this.tvSet = tvSet;
    }

    // переключаем каналы на телевизоре
    public void setChannel(int channel) {
        tvSet.channel = channel;
    }

    //включаем телевоизор
    public void turnOn(){
        tvSet.isOn = true;
    }

    //выключаем телевиозр
    public void turnOff(){
        tvSet.isOn = false;
    }
}
