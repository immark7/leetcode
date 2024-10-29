package medium.remove_duplicates_from_sorted_array_ii;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 1;
        int slow = 0;
        int dup = 1;

        while (fast < nums.length) {
            if (nums[fast] == nums[fast - 1]) {
                dup++;
            } else {
                dup = 1;
            }

            if (dup <= 2) {
                slow++;
                nums[slow] = nums[fast];
            }

            fast++;
        }

        return slow + 1;
    }
}
