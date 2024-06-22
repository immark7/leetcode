package medium.two_sum_ii_input_array_is_sorted;

// Two pointer (sorted array)
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2){
            return new int[]{};
        }

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int sum = nums[left] + nums[right];

            if(sum == target){
                return new int[]{left + 1, right +1};
            } else if(sum < target){
                left++;
            } else {
                right --;
            }
        }

        return new int[]{};
    }
}
