package medium.sliding_window_problem;

//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
public class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int currentSum = 0;

        // sum of the first window
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        // Sum of the first window meets the threshold
        if ((currentSum / k) >= threshold) {
            count++;
        }

        // Slide the window across the array
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];

            if ((currentSum / k) >= threshold) {
                count++;
            }
        }

        return count;
    }
}
