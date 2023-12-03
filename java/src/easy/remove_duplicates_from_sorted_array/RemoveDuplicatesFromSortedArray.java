package easy.remove_duplicates_from_sorted_array;

//Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int result = removeDuplicatesFromSortedArray(nums);
        System.out.println("Result: " + result);
    }

    public static int removeDuplicatesFromSortedArray(int[] nums) {
        int swap = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[swap] = nums[i];
                swap++;
            }
        }
        return swap;
    }
}
