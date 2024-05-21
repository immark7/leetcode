package easy.target_sum;

//  Given a sorted array of integers, return the indices
//  of two elements (in different positions) that sum up to
//  the target value. Assume there is exactly one solution.
public class Solution {
    public static int[] targetSum(int[] nums, int target) {
        int L = 0, R = nums.length - 1;
        while (L < R) {
            if (nums[L] + nums[R] > target) {
                R--;
            } else if (nums[L] + nums[R] < target) {
                L++;
            } else {
                return new int[] {L, R};
            }
        }
        return null;
    }
}
