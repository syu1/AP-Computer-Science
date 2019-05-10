import java.io.*;
import java.util.Scanner;
public class WC
{

  
    public WC()
    {

        Scanner in = new Scanner(System.in);

        System.out.println("What is your file name");

        String file = in.next();

        File inputFile = new File(file);

        try
        {
            Scanner fileChar = new Scanner(inputFile);
            fileChar.useDelimiter("");
            int count = 0;
            while (fileChar.hasNext())
            {
                fileChar.next();
                count++;
            }
            System.out.println("characters: "+count);
            
            Scanner fileWord = new Scanner(inputFile);
            fileWord.useDelimiter(" ");
            
            count = 0;
            while (fileWord.hasNext())
            {
                fileWord.next();
                count++;
            }
            System.out.println("words: "+count);
           
            Scanner fileLine = new Scanner(inputFile);
            fileLine.useDelimiter("\n");
            count = 0;
            while (fileLine.hasNext())
            {
                fileLine.next();
                count++;
            }
            System.out.println("lines: "+count);
            
            fileLine.close();
        }
        catch(IOException misRead)
        {
            //misRead.printStackTrace();
            System.out.println("Don't mispell the file name");
        }
        
    }
    
    public void main(String[] args)
    {
        WC wc = new WC();
    }
}
