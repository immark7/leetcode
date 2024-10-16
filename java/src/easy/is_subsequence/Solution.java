package easy.is_subsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int tPointer = 0;
        int sPointer = 0;

        while (tPointer < t.length() && sPointer < s.length()) {
            if (t.charAt(tPointer) == s.charAt(sPointer)) {
                sPointer++;
            }
            tPointer++;
        }

        return sPointer == s.length();
    }
}
