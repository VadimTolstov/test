package zadachi.Musical;

import zadachi.Musical.Musical;

import java.util.List;

public class Orhestra  {
    protected List<Musical> musicals;

    public Orhestra(List<Musical> musicals) {
        this.musicals = musicals;
    }

    public void  addMusician(Musical m) {
        this.musicals.add(m);
    }

    public void play(){
        for (Musical m : musicals) {
            m.play();
        }
        musicals.forEach(Musical::play);
    }
}
