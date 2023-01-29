package zadachi.Musical;

public class Sing implements Musical{
    private final String name;

    private final boolean readPidzhak = true;

    public Sing(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void greet() {
        System.out.println("Привет, друзья! Я " + name + " ! ");
    }
    @Override
    public void play() {
        System.out.println("Я календарь переверну и снова третье сентебря!");
    }
}
