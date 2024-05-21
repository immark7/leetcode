package easy.is_palindrome;

// Given a string of characters, return true if it's a palindrome,
public class Solution {
    public static boolean isPalindrome(String word) {
        int L = 0, R = word.length() - 1;
        while (L < R) {
            if (word.charAt(L) != word.charAt(R)) {
                return false;
            }
            L++;
            R--;
        }

        return true;
    }
}
