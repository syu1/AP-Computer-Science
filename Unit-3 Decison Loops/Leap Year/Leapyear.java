import java.util.Scanner;


public class Leapyear
{
   public static double year;
  
    public static  void main(String[] args)
    {
        
      Scanner yearinput= new Scanner(System.in);
      System.out.print("\n What is your year is it(please integer): ");
      
      year = yearinput.nextDouble();
      double check4 = year%4.0;
      double check100 = year%100.0;
      double check400 = year%400.0;
      
    if (year >= 1582)
    {
       
        if (check400 == 0)
        System.out.println("It is a geogorian leap year 1");
        else if (check100 == 0)
        System.out.println("It is not a gregorian leap year 2");
        else if (check4 == 0)
        System.out.println("It is a geogorian leap year 3");
        else
        System.out.println("It is not a geogorian leap year 4");
    }
    else if(check4 == 0)
    {
       System.out.println("it is a leap year else before 1582 5");
    }
    else
    {
        System.out.println("it is not a leap year anything before 1582 6");
    }
  
    // might have to do single logic line check with smchit
}
}
