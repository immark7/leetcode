package medium.reverse_words_in_a_string;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();

        for (String word : s.split(" ")) {
            if (word.length() > 0) {
                words.add(word);
            }
        }

        int left = 0;
        int right = words.size() - 1;
        while (left < right) {
            String temp = words.get(left);
            words.set(left, words.get(right));
            words.set(right, temp);

            left++;
            right--;
        }

        return String.join(" ", words);

    }
}