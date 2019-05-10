public class NestedForLoops
    {
        public static void main(String[] args)
        {
            for (int left = 1; left < 3; left++)
            {
                for (int right = 1; right < 5; right++)
                {
                    System.out.println(left + " " + right);
                }
            }
        }
}
