public class Dealer extends Player {

    public String firstCard() {
        System.out.println("The AI's upper card(s) is,");
        for(int b = 1; b < super.hand.size(); b++) {
            System.out.println("   " + super.hand.get(b).stringify());
        }
        return super.hand.get(0).stringify();
    }
    public String stringify() {
        String wholeHand = "";
        System.out.println("In the ai's hand is, ");
        for(int h = 0; h < super.hand.size(); h++) {
            wholeHand += " " + super.hand.get(h).stringify();
            System.out.println("   " + super.hand.get(h).stringify());
        }
        return wholeHand;
    }
}
