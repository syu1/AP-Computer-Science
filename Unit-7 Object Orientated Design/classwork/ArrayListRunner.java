

import java.util.ArrayList;

public class ArrayListRunner
{
    

    
   public static void main(String[] args)
   {
      
       
       ArrayList<String> names = new ArrayList<String>();
       ArrayList<String> names2 = new ArrayList<String>(names);
      
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       
       names.set(0,"Alice B");
       names.add(4,"Dougolusd");
       for(String i: names2)
       {
           System.out.println(i);
           
       }
       
       
   }
} 