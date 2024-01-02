
using System;
namespace RemoveElement
{
    public class Solution
    {
        public int RemoveElement(int[] nums, int val)
        {
            int n = nums.Length;
            int count = 0;

            for (int i = 0; i <n; i++)
            {
                if (nums[i] != val)
                {
                    nums[count] = nums[i];
                    count++;
                }
            }

            return count;
        }
    }
}
