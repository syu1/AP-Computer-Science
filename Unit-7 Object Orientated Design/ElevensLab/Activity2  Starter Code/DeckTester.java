/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
   
    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args)
    {
        String[] ranks ={"King","Queen","Jack"};

        String[] suits ={"Clubs","Hearts","Diamonds"};
        int[] values = {13,12,11};

        Deck deck1  = new Deck(ranks,suits,values);
        System.out.println(deck1.toString());
        System.out.println(deck1.size());
        System.out.println(deck1.deal());
        System.out.println(deck1.toString());
        System.out.println(deck1.size());
    }
}
