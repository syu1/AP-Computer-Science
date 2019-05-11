
public class Vendingmachine
{
    private int numberOfTokens;
    private int numberCansLeft ;
   

    public Vendingmachine(int cans)
    {
      this.numberCansLeft = cans;
      this.numberOfTokens = 0;
    }

    public Vendingmachine()
    {
      this.numberCansLeft = 10;
      this.numberOfTokens = 0;
    }
    
    public void buySoda()
    {
        this.numberCansLeft -=1;
        this.numberOfTokens +=1;
    }
    
    public void fillUp(int morecans)
    {
        this.numberCansLeft += morecans;
    }
    
    public int sodaChecker()
    {
        return this.numberCansLeft;
    }
    
    public int tokenChecker()
    {
        return this.numberOfTokens;
        
    }
}
