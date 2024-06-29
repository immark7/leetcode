package medium.longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLongest = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLongest++;
                }

                longest = Math.max(longest, currentLongest);
            }
        }

        return longest;
    }
}
