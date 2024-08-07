package Ycheba.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/* Exchanger - это синхронизатор, позволяющий обмениваться данными между двумя потоками, обеспечивает то, что оба потока
получат информацию друг от друга одновременно
.exchange(action) - exchange передает свою информацию и в ответ получаем информацию второго потока
 */
public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNICI);
        friend1Action.add(Action.NOJNICI);
        friend1Action.add(Action.KAMEN);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.BUMAGA);

        new BestFriend("Ваня", friend1Action, exchanger);
        new BestFriend("Петя", friend2Action, exchanger);
    }
}

enum Action {
    KAMEN, NOJNICI, BUMAGA;
}

class BestFriend extends Thread {
    private String name;

    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.KAMEN && friendsAction == Action.NOJNICI)
            || (myAction == Action.NOJNICI && friendsAction == Action.BUMAGA)
            || (myAction == Action.BUMAGA && friendsAction == Action.KAMEN)) {
            System.out.println(name + " WINS!!!");
        }
    }

    public void run() {
        Action reply;// ответ друга
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);//exchange передает свою информацию и в ответ получаем информацию второго потока
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
