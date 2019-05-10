
import java.util.Scanner;
import java.util.Random; 

public class SwapLetters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random r = new Random(); 

        System.out.print("Enter a word to be scrambled: ");
        String word = in.nextLine();
        String word2 = in.nextLine();
        int length = word.length();
        String first="";
        String second="";
        String third="";
        int i;
        int j;
        for (int a = 0; a < length; a++)
        {
            i = r.nextInt(length);
            j = r.nextInt(length);
            while (i >= j)
            {
                j = r.nextInt(length);
                i = r.nextInt(length);
                
            }
            char firstLetter = word.charAt(i);
            char secondLetter = word.charAt(j);
            
            first = word.substring(0, i);
            second = word.substring(i+1,j);
            third = word.substring(j+1);
            
            word = first+secondLetter+second+firstLetter+third;
            System.out.println("Your new scrambled word is: "+word);
        }
        
    }
}
