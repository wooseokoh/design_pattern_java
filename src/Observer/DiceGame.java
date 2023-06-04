package Observer;

import java.util.LinkedList;

public abstract class DiceGame {
    protected LinkedList<Player> playerLinkedList = new LinkedList<Player>();

    public void addPlayer(Player player){
        playerLinkedList.add(player);
    }

    public abstract void play();
}
