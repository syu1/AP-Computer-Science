import java.util.Scanner;
public class rec
{
    static double width, length, area, peri;
    //makes it global varible no scope
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        
        System.out.print("\nWhat is the length: ");
        width = user.nextDouble();
        
        System.out.print("What is the width: ");
        length = user.nextDouble();
        
        area = width*length;
        peri= width+width+length+length;
        System.out.print("Area "+ area);
      
        System.out.print("\nPerimeter "+peri);
        
        
        
       
    }
}
//indexing char start = name.charAt(0);
//indexing char last = name.charAt(4);
// String sub = greeting.substring(0,5);
// indexes multiple elements
//Can leave off last index number, (0); means 0 to end
// int index = greeting.indexOf("world");
//find index number, first element position returned
//escape sequence same as python \n \" \\ \b \t \r \'