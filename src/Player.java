public class Player extends Person {

    public String stringify() {
        String wholeHand = "";
        System.out.println("In your hand you have, ");
        for(int h = 0; h < super.hand.size(); h++) {
            wholeHand += " " + super.hand.get(h).stringify();
            System.out.println("   " + super.hand.get(h).stringify());
        }
        return wholeHand;
    }

}
