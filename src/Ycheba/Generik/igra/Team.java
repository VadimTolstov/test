package Ycheba.Generik.igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends  Participant> {// <T extends  Participant> делая так мы говорим что все подрят здесь не может
    // быть а токлько Participant и его наследники
    private String name;
    private List<T> participantList = new ArrayList<>();//и соответсвтенно вместо List <Participant> будет List<T>

    public Team(String name) {
        this.name = name;
    }

    // и тут добовлять теперь можем не всех подрят а только одинаковый класс который определили в <T>
    public void addNewParticipant(T participant){
        participantList.add(participant);
        System.out.println("В команде "+ name + " был добавлен новый участник по имени " + participant.getName());
    }
    public void playWith(Team<T> team){//Team<T> показывает что мы можем передавать один и то-тже клас только
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0){
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Выиграла команда " + winnerName);
    }
}
