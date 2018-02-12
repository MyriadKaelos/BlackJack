
import java.util.ArrayList;
import java.util.Random;

public class Deck {

    static ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        for(int i=1; i<14;i++) {
            for(int j=1; j<5;j++) {
                cards.add(new Card(i,j));
            }
        }
    }

    public static Card dealCard() {
        int y = new Random().nextInt((cards.size()));
        Card newCard = cards.get(y);
        cards.remove(y);
        return newCard;
    }

    public void stringify() {
        for( int x=0; x<cards.size();x++) {
            System.out.println(this.cards.get(x).stringify());
        }
    }

}
