


public class Array2D
{
 
    
      int[][] table = 
   {
      {1,2,3},
      {4,5,6},
      {7,8,9},
      {10,11,12}
   }; 
    /**
     * Default constructor for objects of class Array2D
     */
    public Array2D()
    {
     
    }

      /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
   

    public String toString()
    {
       
        String str = "";
        // table.length is the number of rows in the talbe
        for( int row = 0; row< table.length; row++)
        //table[row].length is trhe number of columnns in the row
        {
            for ( int col = 0; col< table[row].length; col++)
            {
            str += table[row][col] + "\t";
            }
       str+= "\n";
       
        }
    return str;
}
public String extractRow (int row)
{
String str = "";
for(int col = 0; col < table[row].length; col++)
{
    str += table[row][col] + "\t";
}
return str;
//for( itn val : talbe[row])
//{
 //   str+= val + "\t";
//}
}
public String extractColumn( int col )
{
    String str = "";
    
    for( int row = 0; row < table.length; row++)
    {
        str += table[row][col]+ "\t";
        
    }
    return str;
}
    public static void main(String[] args)
    
    {
   Array2D table = new Array2D();
   System.out.println(table.toString());
   System.out.println(table.extractRow(1));
}
}



