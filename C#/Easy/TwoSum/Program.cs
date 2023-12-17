using System;
namespace TwoSum
{
    public class Program
    {
        public static void Main()
        {
            Solution solution = new Solution();

            int[] nums = { 2, 7, 11, 15 };
            int target = 9;
            int[] result = solution.TwoSum(nums, target);

            Console.WriteLine("Indices: " + result[0] + ", " + result[1]);
        }
    }
}