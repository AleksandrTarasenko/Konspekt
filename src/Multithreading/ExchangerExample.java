package Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    //Exchanger – это синхронизатор, позволяющий обмениваться данными между двумя потоками,
    //обеспечивает то, что оба потока получат информацию друг от друга одновременно.
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNICI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJNICI);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);
        new BestFriend("Vanya", friend1Action, exchanger);
        new BestFriend("Petya", friend2Action, exchanger);

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
    private void whoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.KAMEN && friendAction == Action.NOJNICI)
        || (myAction == Action.NOJNICI && friendAction == Action.BUMAGA)
                ||(myAction == Action.BUMAGA && friendAction == Action.KAMEN))
        {
            System.out.println(name + " WINS!");
        }
    }

    public void run() {
        Action replay;
        for (Action action : myActions) {
            try {
                replay = exchanger.exchange(action);
                //использует метод exchange и получает в качестве параметра первое для сравнения значение
                whoWins(action, replay);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
