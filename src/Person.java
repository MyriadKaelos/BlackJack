import java.util.ArrayList;

public class Person{

    ArrayList<Card> hand = new ArrayList<>();

    public int valueOfHand() {
        int trueValue = 0;
        for(int g = 0;g < hand.size(); g++) {
            trueValue += hand.get(g).ValueOfCard();
        }
        return trueValue;
    }
    public boolean hasAce() {
        for(int k = 0;k < hand.size(); k++) {
            if(hand.get(k).num == 1) {
                return true;
            }
        }
        return false;
    }
    public void newCard() {
        hand.add(Deck.dealCard());
    }

}
