import java.text.BreakIterator;
import java.util.*;

public class Runner {
    static boolean thing = true;
    static boolean dead = false;
    public static void main(String[] args) {
        Deck newDeck = new Deck();
        Player user = new Player();
        Dealer ai = new Dealer();
        user.newCard();
        ai.newCard();
        user.newCard();
        ai.newCard();
        user.stringify();
        ai.firstCard();
        user.valueOfHand();
        Scanner in = new Scanner(System.in);
        while(thing == true) {
            System.out.println("Would you like another card? Yes, or No");
            String hit = in.next().toLowerCase();
            while (!hit.equals("yes") && !hit.equals("no")) {
                System.out.println("INVALID");
                hit = in.next().toLowerCase();
            }
            if (hit.equals("no")) {
                thing = false;
                if(user.hasAce() && user.valueOfHand() >= 10) {
                    Card Ten = new Card(10,2);
                    user.hand.add(Ten);
                }
            } else {
                user.newCard();
                user.valueOfHand();
                user.stringify();
                if(user.valueOfHand() >= 21) {
                    thing = false;
                    dead = true;
                }
            }
            if(user.valueOfHand() > 21) {
                System.out.println("I bust!");
                System.out.println("The AI cackles at the thought of a robot uprising.");
            }
        }
        int aces = 0;
        if(ai.hasAce()) {
            aces = 10;
        }
        while(ai.valueOfHand() + aces <= 16 && dead == false) {
            ai.newCard();
            System.out.println("The ai takes a new card.");
            ai.firstCard();
            if(ai.hasAce()) {
                aces = 10;
            }
        }
        if(ai.valueOfHand() > 21) {
            System.out.println("The AI screams in horror, they have gone over 21!");
        } else {
            if(ai.valueOfHand() > user.valueOfHand() || dead == true) {
                System.out.println("The AI does a little dance.");
            } else if(ai.valueOfHand() == user.valueOfHand()) {
                System.out.println("The AI looks down, then back at you.");
                System.out.println("The AI is very confused by a tie.");
            } else {
                System.out.println("HOW! the ai screams.");
                System.out.println("You cannot be human!");
            }
        }
        System.out.println("The ai reveals their hand.");
        ai.stringify();
    }
}
