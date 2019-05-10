
import java.util.*;

public class ListMethods
{
    
   public static ArrayList makeList(int n)
   {
      ArrayList<Integer> tempList= null;
    ArrayList<Integer> arthList = null;
      if (n <= 0)  // The smallest list we can make
      {
          tempList = new ArrayList(0);
          return tempList;


      }
      else        // All other size lists are cred here
      {
          arthList.add(n);
          n--;
          tempList = ListMethods.makeList(n);
          


      }
      return arthList;
   }
} 