import easy.TwoSum;

public class Main {
    public static void main(String[] args) {

        // Problem: https://leetcode.com/problems/two-sum/
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.solving(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
