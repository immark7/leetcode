package medium.longest_repeating_substring_with_replacement;

public class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; 
        int maxCount = 0;        
        int maxLength = 0;        
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            int index = s.charAt(end) - 'A';
            count[index]++;
            maxCount = Math.max(maxCount, count[index]);

            while (end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
