using System;
namespace TwoSum
{
    public class Solution
    {
        public int[] TwoSum(int[] nums, int target)
        {
            Dictionary<int, int> prevMap = new Dictionary<int, int>();

            for (int i = 0; i < nums.Length; i++)
            {
                var num = nums[i];
                var complement = target - num;

                if (prevMap.ContainsKey(complement))
                {
                    return new int[] { prevMap[complement], i };
                }
                prevMap[num] = i;
            }

            return null;
        }
    }
}