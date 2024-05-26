package easy.remove_duplicates_from_sorted_array;

// Two pointer
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int result = removeDuplicatesFromSortedArray(nums);
        System.out.println("Result: " + result);
    }

    public static int removeDuplicatesFromSortedArray(int[] nums) {
        if (nums.length == 0) return 0;


        // pointer for the unique element
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
