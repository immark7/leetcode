namespace ContainsDuplicate
{
    public class Program
    {
        public static void Main()
        {
            Solution solution = new Solution();

            int[] nums = { 1, 2, 3, 4, 5 };
            bool result = solution.ContainsDuplicate(nums);
            Console.WriteLine("Contains duplicate: " + result);

            int[] nums2 = { 1, 2, 3, 4, 1 };
            bool result2 = solution.ContainsDuplicate(nums2);
            Console.WriteLine("Contains duplicate: " + result2);
        }
    }
}