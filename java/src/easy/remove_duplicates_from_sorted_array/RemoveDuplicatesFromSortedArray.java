package easy.remove_duplicates_from_sorted_array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int result = removeDuplicatesFromSortedArray(nums);
        System.out.println("Result: " + result);
    }

    public static int removeDuplicatesFromSortedArray(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
