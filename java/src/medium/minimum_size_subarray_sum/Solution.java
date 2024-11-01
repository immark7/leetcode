package medium.minimum_size_subarray_sum;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int fast = 0;
        int slow = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (fast < nums.length) {
            sum += nums[fast];

            while (sum >= target) {
                minLen = Math.min(minLen, fast - slow + 1);
                sum -= nums[slow];
                slow++;
            }

            fast++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
