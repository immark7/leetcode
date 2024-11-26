package medium.house_robber;

public class Solution {
    public int rob(int[] nums) {
        return maxRob(0, nums);
    }

    private int maxRob(int i, int[] nums) {
        if (i > nums.length) {
            return 0;
        }

        return Math.max(maxRob(i + 1, nums), nums[i] + maxRob(i + 2, nums));
    }
}
