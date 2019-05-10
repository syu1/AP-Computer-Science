/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
// 		String[] ranks = {"jack", "queen", "king"};
// 		String[] suits = {"blue", "red"};
// 		int[] pointValues = {11, 12, 13};
// 		Deck d = new Deck(ranks, suits, pointValues);
// 
// 		System.out.println("**** Original Deck Methods ****");
// 		System.out.println("  toString:\n" + d.toString());
// 		System.out.println("  isEmpty: " + d.isEmpty());
// 		System.out.println("  size: " + d.size());
// 		System.out.println();
// 		System.out.println();
// 
// 		System.out.println("**** Deal a Card ****");
// 		System.out.println("  deal: " + d.deal());
// 		System.out.println();
// 		System.out.println();
// 
// 		System.out.println("**** Deck Methods After 1 Card Dealt ****");
// 		System.out.println("  toString:\n" + d.toString());
// 		System.out.println("  isEmpty: " + d.isEmpty());
// 		System.out.println("  size: " + d.size());
// 		System.out.println();
// 		System.out.println();
// 
// 		System.out.println("**** Deal Remaining 5 Cards ****");
// 		for (int i = 0; i < 5; i++) {
// 			System.out.println("  deal: " + d.deal());
// 		}
// 		System.out.println();
// 		System.out.println();
// 
// 		System.out.println("**** Deck Methods After All Cards Dealt ****");
// 		System.out.println("  toString:\n" + d.toString());
// 		System.out.println("  isEmpty: " + d.isEmpty());
// 		System.out.println("  size: " + d.size());
// 		System.out.println();
// 		System.out.println();
// 
// 		System.out.println("**** Deal a Card From Empty Deck ****");
// 		System.out.println("  deal: " + d.deal());
// 		System.out.println();
// 		System.out.println();

		/* *** TO BE COMPLETED IN ACTIVITY 4 *** */
		String[] deckRanks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine",
		"Ten","Jack", "Queen", "King"};
		String[] deckSuits = {"Clubs", "Hearts","Diamonds","Spades"};
		int[] deckPointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck fullDeck = new Deck(deckRanks,deckSuits,deckPointValues);
		
		System.out.println("  toString:\n" + fullDeck.toString());
		System.out.println("  isEmpty: " + fullDeck.isEmpty());
		System.out.println("  size: " + fullDeck.size());
		
		System.out.println();
		System.out.println();
		
 		fullDeck.shuffle(fullDeck.getCards());
 		System.out.println("  toString:\n" + fullDeck.toString());
 		System.out.println("  isEmpty: " + fullDeck.isEmpty());
 		System.out.println("  size: " + fullDeck.size());
	}
}
