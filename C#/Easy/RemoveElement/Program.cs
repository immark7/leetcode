using System;
namespace RemoveElement
{
    public class Program
    {
        public static void Main()
        {
            Solution solution = new Solution();
            int[] nums = { 3, 2, 2, 3 };
            int val = 3;
            int result = solution.RemoveElement(nums, val);

            Console.WriteLine("Result: " + result);
        }
    }
}