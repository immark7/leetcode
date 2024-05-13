package medium.maximum_subarray;

public class Solution {

    public int maxSubArray(int[] nums){
        if(nums == null || nums.length == 0){
            throw new IllegalArgumentException("Input array is empty");
        }

        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i <nums.length; i++){
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }
}
