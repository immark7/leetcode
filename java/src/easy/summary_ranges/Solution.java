package easy.summary_ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int fast = 1;
        int slow = 0;

        while (fast <= nums.length) {
            boolean isEnd = fast == nums.length;
            boolean isNotConsecutive = !isEnd && nums[fast] - nums[fast - 1] != 1;

            if (isNotConsecutive || isEnd) {
                boolean isStarted = fast - slow == 1;
                if (isStarted) {
                    result.add(String.valueOf(nums[slow]));
                } else {
                    result.add(nums[slow] + "->" + nums[fast - 1]);
                }
                slow = fast;
            }

            fast++;
        }

        return result;
    }
}
