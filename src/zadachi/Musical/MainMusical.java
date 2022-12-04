package zadachi.Musical;

import java.util.LinkedList;
import java.util.List;

public class MainMusical {
    public static void main(String[] args) {
        List<Musical> musicals = new LinkedList<>();

        musicals.add(new Gutar());
        musicals.add(new Violin());

        Orhestra orhestra = new Orhestra(musicals);

        orhestra.addMusician(new Drum());
        orhestra.addMusician(new Bas());
        orhestra.addMusician(new Piano());

        Sing sing = new Sing("Шофутинский");

        orhestra.addMusician(sing);

        sing.greet();

        orhestra.play();
    }
}
