package easy.length_of_last_word;

public class Solution {
    public int lengthOfLastWord(String s) {
        int p = s.length() - 1;
        int count = 0;

        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }

        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
            count++;
        }

        return count;
    }
}
