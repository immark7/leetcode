package easy.longest_subarray;

// Find the length of the longest subarray, with the same value in each position
public class Solution {
    public static int longestSubarray(int[] nums) {
        int length = 0;
        int L = 0;
        for (int R = 0; R < nums.length; R++) {
            if (nums[L] != nums[R]) {
                L = R;
            }
            length = Math.max(length, R - L + 1);
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 2, 2, 2, 2};
        System.out.println(longestSubarray(nums));
    }
}
