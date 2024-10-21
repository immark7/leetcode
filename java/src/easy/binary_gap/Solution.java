package easy.binary_gap;

public class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int left = -1;
        int right = 0;
        int maxGap = 0;

        while (right < binary.length()) {
            if (binary.charAt(right) == '1') {
                if (left != -1) {
                    maxGap = Math.max(maxGap, right - left);
                }
                left = right;
            }
            right++;
        }

        return maxGap;
    }
}
