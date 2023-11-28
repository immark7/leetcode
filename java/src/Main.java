import easy.RemoveDuplicatesFromSortedArray;

public class Main {
    public static void main(String[] args) {

        //Problem: https://leetcode.com/problems/two-sum/
        //TwoSum twoSum = new TwoSum();
        //int[] nums = {2, 7, 11, 15};
        //int target = 9;
        //int[] result = TwoSum.solving(nums, target);
        //System.out.println("Indices: " + result[0] + ", " + result[1]);


        //Problem: https://leetcode.com/problems/contains-duplicate/
        //ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        //int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        //boolean result = containsDuplicate.solving(nums);
        //System.out.println("Result: " + result);

        //Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 5};
        int result = RemoveDuplicatesFromSortedArray.solving(nums);
        System.out.println("Result: " + result);
    }
}
