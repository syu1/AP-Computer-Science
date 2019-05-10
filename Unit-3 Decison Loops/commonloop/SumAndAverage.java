import java.util.Scanner;


public class SumAndAverage
{
    /**
     * computes the sum and average of the specififed series of numbers.
     */

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "Eneter a series of numbers, type 'q' to exit.");
        double total = 0;
        int count = 0;
        //returns true or false if there is waiting double
        while( in.hasNextDouble() )
        {
            double value = in.nextDouble();
            total += value;
            count++;
            
        }
        double average = 0;
        if (count > 0)
      
        {
            average = total/count;
        }
        System.out.println( "Total: " + total + " average: " + average);
    }
}
