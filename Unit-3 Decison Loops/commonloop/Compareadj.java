import java.util.Scanner;


/**
 * Write a description of class Compareadj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compareadj
{
   
    /**
    * Detects duplicate adjacent numbers in the specific series of numbers.
     */
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println( "Enter a series of numbers (type 'q' to quit): ");
       double prevValue = in.nextDouble();
       
       while( in.hasNextDouble() )
       {
           double value = in.nextDouble();
           if(value == prevValue)
           {
               System.out.println( "Duplicate number!");
           }
           prevValue = value;
        }
        
    }

}
