


public class Arrayoperations
{
   // but this already creates a array with five numbers in it
    private int[] values= {1,4,9,16,25};
    private int currentSize;
    private int currentIndex;
    public Arrayoperations()
    {
       this.currentSize = values.length;
       this.currentIndex = 0;
    }
    

    public void swapFirstLast()
    {
       
        int firstTemp = values[0];
        int lastTemp = values[4];
        //a different trial
        values[0] = values[4];
        values[4] = firstTemp;
    }
    public String toString()
    
           
    {
        
        String str= "";
        for( int i = 0; i < this.currentIndex; i++)
        {
             
             str += this.values[i]; 
            
             
             this.currentIndex++;
        }
        
       return str;
    }
       
   
    }


