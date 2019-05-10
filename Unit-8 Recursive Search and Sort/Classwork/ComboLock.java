

/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
   private final int LOCK_TICKS = 40;
   private int currentTick;
   private int firstCorrectNum;
   private int secCorrectNum;
   private int thirdCorrectNum;
   //insert guesses
   private int firstGuess;
   private int secGuess;
   private int thirdGuess;
   
   public ComboLock( int secret1, int secret2, int secret3 )
   {
       currentTick = 0;
       firstCorrectNum = secret1;
       secCorrectNum = secret2;
       thirdCorrectNum = secret3;
       firstGuess = 0;
       secGuess = 0;
       thirdGuess = 0;
   
    }
   
   public void reset()
   { 
       currentTick = 0;
   
    }
   
   public void turnLeft( int ticks )
   {
           if ( ticks+currentTick > LOCK_TICKS)
           {
               currentTick += ticks%LOCK_TICKS;
        }
        else
        {
            currentTick += ticks;
        }
        System.out.println(this.currentTick);

    }
   
   public void turnRight( int ticks ) 
   {
       if ((currentTick - ticks) < 0)
       {
           currentTick += LOCK_TICKS-ticks;
           
        }
        else
        {
            currentTick -= ticks;
            
        }
        System.out.println(this.currentTick);
    }
   
   public boolean open()
   {
       boolean status = false;
       if (firstGuess == firstCorrectNum && secGuess == secCorrectNum && 
       thirdGuess == thirdCorrectNum)
       {
           status = true;
        }
        return status;
    
    }

    public static void main(String[] args)
    {
        ComboLock lock = new ComboLock(30,10,30);
        lock.turnRight(10);
        lock.currentTick = lock.firstGuess;
        lock.turnLeft(60);
        lock.currentTick = lock.secGuess;
        lock.turnRight(20);
        lock.currentTick = lock.thirdGuess;
        System.out.println(lock.open());
    }

}
