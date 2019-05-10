import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;

    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
    public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    @Override
    public boolean isLegal(List<Integer> selectedCards)
    {

        int cardIndexOne = selectedCards.get(0);
        Card cardOne = cardAt(cardIndexOne);
        int c1PointValue = cardOne.pointValue();

        int cardIndexTwo = selectedCards.get(1);
        Card cardTwo = cardAt(cardIndexTwo);
        int c2PointValue = cardTwo.pointValue();

        if(selectedCards.size() == 2)
        {

            if(containsPairSum11(selectedCards) == true)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(selectedCards.size() == 3)
        {
            int cardIndexThree = selectedCards.get(2);
            Card cardThree = cardAt(cardIndexThree);
            int c3PointValue = cardThree.pointValue();

            if(containsJQK(selectedCards) == true )
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        else
        {
            return false;
        }
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() 
    {
        List<Integer> mySelected = new ArrayList<Integer>();
        mySelected = cardIndexes();
        int s = mySelected.size();
        int countTotal = 0;
        int count1 = 0;
        int count2 = 0;
        for (int a = 0; a < s; a++) {
            for (int b = a + 1; b < s; b++)
            {
                List<Integer> selected11 = new ArrayList<Integer>();
                selected11.add(a);
                selected11.add(b);
                
                if(isLegal(selected11) == true)
                {
                    count1++;
                }

                for (int c = b + 1; c < s; c++)
                {

                    List<Integer> selectedJQK = new ArrayList<Integer>();
                    selectedJQK.add(a);
                    selectedJQK.add(b);
                    selectedJQK.add(c);

                    if(isLegal(selectedJQK) == true)
                    {
                        count2++;
                    }
                }
            }
        }
        
          countTotal = count1+count2;
         
        if(countTotal > 0)
        {
            
            return true;
        }

        else
        {
            
            return false;
        }

    }

    /**
     * Check for an 11-pair in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return true if the board entries in selectedCards
     *              contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> selectedCards)
    {
        int cardIndexOne = selectedCards.get(0);
        Card cardOne = cardAt(cardIndexOne);
        int c1PointValue = cardOne.pointValue();

        int cardIndexTwo = selectedCards.get(1);
        Card cardTwo = cardAt(cardIndexTwo);
        int c2PointValue = cardTwo.pointValue();
        int total = c1PointValue + c2PointValue;
        
        
        if(total == 11)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Check for a JQK in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return true if the board entries in selectedCards
     *              include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) {
        int cardIndexOne = selectedCards.get(0);
        Card cardOne = cardAt(cardIndexOne);
        int c1PointValue = cardOne.pointValue();

        int cardIndexTwo = selectedCards.get(1);
        Card cardTwo = cardAt(cardIndexTwo);
        int c2PointValue = cardTwo.pointValue();

        int cardIndexThree = selectedCards.get(2);
        Card cardThree = cardAt(cardIndexThree);
        int c3PointValue = cardThree.pointValue();
        
        String rank1 = cardOne.rank();
        String rank2 = cardTwo.rank();
        String rank3 = cardThree.rank();
        String JQKcombo1 = "jackqueenking";
        String JQKcombo2 = "jackkingqueen";
        String JQKcombo3 = "kingjackqueen";
        String JQKcombo4 = "kingqueenjack";
        String JQKcombo5 = "queenjackking";
        String JQKcombo6 = "queenkingjack";
        String totalRank = rank1+rank2+rank3;
        
        if(totalRank.equals(JQKcombo1) || totalRank.equals(JQKcombo2) || totalRank.equals(JQKcombo3) || totalRank.equals(JQKcombo4) || totalRank.equals(JQKcombo5) ||
        totalRank.equals(JQKcombo6) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
