package easy.merge_sorted_array;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int k = 0;

        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        while (p1 < m && p2 < n) {
            if (nums1Copy[p1] <= nums2[p2]) {
                nums1[k] = nums1Copy[p1];
                p1++;
            } else {
                nums1[k] = nums2[p2];
                p2++;
            }
            k++;
        }

        while (p1 < m) {
            nums1[k] = nums1Copy[p1];
            p1++;
            k++;
        }

        while (p2 < n) {
            nums1[k] = nums2[p2];
            p2++;
            k++;
        }
    }
}