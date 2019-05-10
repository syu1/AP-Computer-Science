
public class NestedWhileLoops
{
public static void main(String[] args)
{
int left = 1; 
while (left < 3)
{ 
int right = 1;
while (right < 5)
{
System.out.println(left + " " + right);
right++;
}
left++;
}
}
}
