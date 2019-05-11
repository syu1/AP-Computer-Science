
public class DistanceConverter
{
   static final double  feetconverter = 3.0;
   static final double inchconverter = 12.0;
   public static void main(String[] args)
   {  
      final double  feetconverter = 3.0;
      final double inchconverter = 12.0;
      double yards = 3.5;
      double feet = yards * feetconverter;
      double inches = feet * inchconverter;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}