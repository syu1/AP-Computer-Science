import java.util.Scanner;


public class Findmax
{
    /**
     * Find the maximum number in the specified series of numbers
     */
  
    
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      System.out.println( "Enter a series of numbers (type 'q' to quit) " );
      double maxValue = input.nextDouble();
      while( input.hasNextDouble() )
     {
         System.out.println( "Enter the next number: " );
         double value = input.nextDouble(); 
        
      
          
          if( value > maxValue)
        {
          maxValue = value;
        }
        System.out.println("Maximum value: " + maxValue);
    }

}
}