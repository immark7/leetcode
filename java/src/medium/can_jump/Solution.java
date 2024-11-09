package medium.can_jump;

public class Solution {
    public boolean canJump(int[] nums) {
        return canJumpRecursive(nums, 0);
    }

    private boolean canJumpRecursive(int[] nums, int position) {
        //Base case
        if (position >= nums.length - 1) {
            return true;
        }

        int maxJump = nums[position];
        for (int jump = 1; jump <= maxJump; jump++) {
            boolean isReached = canJumpRecursive(nums, position + jump);

            if (isReached) {
                return true;
            }
        }

        return false;
    }
}
