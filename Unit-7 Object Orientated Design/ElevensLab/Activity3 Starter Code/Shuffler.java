 import java.util.Random;
 
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 1;

    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) 
    {
        System.out.println("Results of " + SHUFFLE_COUNT +
            " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3,4};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
            " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3,4};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the car ds in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values)
    {
       
        //problem is when it reaches the middle, need to add rounding or else index is out of bounds
        int k  = 0;
        int b = 1;
        int[] totalShuffle = new int[values.length];
        for( int i = 0; i <(values.length+1)/2; i++)
        { 
            //sorts even numbers, first half
            totalShuffle[k] = values[i];
            k+=2;

        }
        for( int p = (values.length+1)/2; p <values.length; p++)
        {
            //sorts cards into from odds
            //second half
            totalShuffle[b] = values[p];
            b+=2;
        }
        //combines shuffled top and bottom cards
        for( int i = 0; i <values.length; i++)
        {
            values[i] = totalShuffle[i];
        }
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values)
    {
        int k = values.length;
        //random num
        Random ran = new Random();
        //length of the cards array
       
        //empty array
        int[] shuffled = new int[values.length];
        //
        for( int i = 0; i < k; i++)
        {
            int j = ran.nextInt(k);
            int temp = values[i];
            values[i]= values[j];
            values[j] = temp;
            
            
        }
    }
}
