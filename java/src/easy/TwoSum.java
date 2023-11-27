package easy;

import java.util.HashMap;

public class TwoSum {
    public static int[] solving(int[] nums, int target) {
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
