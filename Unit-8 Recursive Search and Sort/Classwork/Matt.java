
import java.util.*;

public class Matt
{
    
   public static ArrayList makeList(int n, ArrayList<Integer> numList)
   {
      ArrayList<Integer> tempList= null;
      if (n <= 0)  // The smallest list we can make
      {
          tempList = numList;
          return tempList;


      }
      else        // All other size lists are cred here
      {
          tempList = numList;
          tempList.add(n);
          n--;
          return Matt.makeList(n,tempList);
          


      }
   }
   public static void main(String[] args)
   {
      ArrayList<Integer> numList = new ArrayList<Integer>();
      ArrayList<Integer> tempList = Matt.makeList(5,numList);
      if (tempList.size() == 0)
      {
          System.out.println("The list is empty");
      }
      else
      {
         for (Integer i : tempList)
         {
            System.out.println(i);
         }
      }
   }
} 