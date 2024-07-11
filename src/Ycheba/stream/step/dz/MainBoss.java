package Ycheba.stream.step.dz;

public class MainBoss {
    public static void main(String[] args) {
        Boss boss = new Boss();
        String result = boss.workRab( n -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Пахать лохи!!!");
            }
            return "Success";
        }, 5);
        System.out.println(result);
    }
}
