namespace RemoveDuplicatesFromSortedArray
{
    public class Program
    {
        public static void Main()
        {
            Solution solution = new Solution();

            int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
            int result = solution.removeDuplicates(nums);

            Console.WriteLine("Result: " + result);
        }
    }
}