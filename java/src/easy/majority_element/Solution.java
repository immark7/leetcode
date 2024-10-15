package easy.majority_element;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int threshold = nums.length / 2;

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) > threshold) {
                return num;
            }
        }

        throw new IllegalArgumentException("No majority element exists");
    }
}
