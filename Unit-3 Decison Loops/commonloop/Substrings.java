
import java.util.Scanner;

public class Substrings
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in); 

            System.out.print("Enter a word to see its substrings: ");
            String word = in.nextLine();
            int length = word.length();
            char subletter;
            String substring;
            

            for (int a = 1; a < length+1; a++)
                {
                    if (a == 1)
                    {
                        for (int b = 0; b < length; b++)
                        {
                            subletter = word.charAt(b);
                            System.out.println(subletter);
                        } 
                    }
                    else
                    {
                        for (int b = 0; b < length - a + 1; b++)
                        {
                            substring = word.substring(b, b+a);
                            System.out.println(substring);
                        }
                    } 
                }
            }
}