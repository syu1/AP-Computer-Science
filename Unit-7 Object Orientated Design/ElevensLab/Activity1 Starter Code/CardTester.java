/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        Card c1 = new Card("Ace","Clubs",1);
        Card c2 = new Card("Two","Diamonds",2);
        Card c3 = new Card("King","Hearts",13);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
