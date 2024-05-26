package easy.is_palindrome_ii;

// Two pointer
public class Solution {
    public boolean isPalindrome(String s) {
        // Filter the string to keep only alphanumeric characters
        StringBuilder filteredString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(c);
            }
        }

        int L = 0, R = filteredString.length() - 1;
        while (L < R) {
            if (filteredString.charAt(L) != filteredString.charAt(R)) {
                return false;
            }
            L++;
            R--;
        }

        return true;
    }
}
