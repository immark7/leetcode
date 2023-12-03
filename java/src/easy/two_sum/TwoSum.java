package easy.two_sum;

import java.util.HashMap;

//Problem: https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (prevMap.containsKey(complement)) {
                return new int[]{prevMap.get(complement), i};
            }

            prevMap.put(num, i);
        }

        return new int[]{};
    }
}
