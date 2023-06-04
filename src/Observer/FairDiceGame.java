package Observer;

import java.util.Iterator;
import java.util.Random;

public class FairDiceGame extends DiceGame{
    private Random random = new Random();

    @Override
    public void play() {
        int diceNumber = random.nextInt(6) + 1;
        System.out.println("주사위 던짐" + diceNumber);

        Iterator<Player> iter = playerLinkedList.listIterator();
        while (iter.hasNext()){
            iter.next().update(diceNumber);
        }

    }
}
