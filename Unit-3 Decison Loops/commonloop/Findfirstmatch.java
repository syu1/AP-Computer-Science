import java.util.Scanner;


public class Findfirstmatch
{
  /**
   * Computes the index of the first space (' ') in the specified string.
   */
 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();
        
        boolean found = false;
        int index = 0;
        
        while( !found && index<str.length() )
        {
            char ch = str.charAt(index);
            if(ch == ' ')
            {
                // can get rid of found = true; and replace with break
                found = true;
            }
            else
            {
            index++;
        }
        }
        if (found)
        {
        System.out.println( " index of frist space: " + index);
    }
}
}
