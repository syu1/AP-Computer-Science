
public class NestedDoLoops
{
public static void main(String[] args)
{
int left = 1;
do 
{
int right = 1;
do
{
System.out.println(left + " " + right);
right++; 
} while (right < 5);
left++;
} while (left < 3);
}
}