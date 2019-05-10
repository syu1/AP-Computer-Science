
import java.util.Random;

public class DieSimulator

{
    public static void main(String[] args)
    {
        Random die = new Random();
        int nextdie = die.nextInt(6);
        
        
        System.out.println(nextdie + 1);
        
    }
}