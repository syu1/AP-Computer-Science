import java.lang.Math;
import java.util.Scanner;

public class Annunity
{
    // static makes them global variable and attributes
    static double pmt, i, n;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
    
        System.out.print ("Enter the first payment: ");
        pmt = s.nextDouble();   

        System.out.print ("Enter the interest: ");
        i = s.nextDouble();

        System.out.print ("Enter the number of payments: ");
        n = s.nextDouble();
        
        double pv = pmt * (((((Math.pow((1+i), (n-1)))-1)/i)/(Math.pow((1+i),(n-1))))+1);
        System.out.println(pv);
    
    
       
    }
    }