
import java.util.Scanner;
public class CircleOverlap
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);

System.out.print("Input the radius of the first circle (must be a positive value): ");
double radius1 = in.nextDouble(); 
double xcenter1 = 0;
double ycenter1 = 0;
System.out.print("Input the radius of the second circle (must be a positive value): ");
double radius2 = in.nextDouble(); 
double xcenter2 = 40;
double ycenter2 = 0; 


if (radius1 == radius2)
{
if (radius1 < 20)
{
System.out.println("The two circles are disjointed.");
}
else if (radius1 >= 20)
{
System.out.println("The two circles are overlapping.");
} 
}
else if (radius1 > radius2)
{ 
double calculation1 = radius1 - radius2;
double calculation2 = radius1 + radius2;
if (calculation1 >= 40)
{
System.out.println("The two circles are mutually contained.");
}
else if (calculation2 < 40)
{
System.out.println("The two circles are disjointed.");
}
else
{
System.out.println("The two circles are overlapping.");
} 
}
else
{ 
double calculation1 = radius2 - radius1;
double calculation2 = radius1 + radius2;
if (calculation1 >= 40)
{
System.out.println("The two circles are mutually contained.");
}
else if (calculation2 < 40)
{
System.out.println("The two circles are disjointed.");
}
else
{
System.out.println("The two circles are overlapping.");
} 
}


}
}