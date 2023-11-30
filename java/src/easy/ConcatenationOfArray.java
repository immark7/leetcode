package easy;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3, 4};
        int[] result = getConcatenation(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }


    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}