package easy.find_kth_character_in_string_game_i;

public class Solution {
    public char kthCharacter(int k) {
        String initialWord = "a";
        String finalString = buildString(initialWord, k);
        return finalString.charAt(k - 1);
    }

    private String buildString(String word, int k) {
        if (word.length() >= k) {
            return word;
        }

        String newString = word + generateNextString(word, k);
        return buildString(newString, k);
    }

    private String generateNextString(String word, int k) {
        StringBuilder nextString = new StringBuilder();

        for (char c : word.toCharArray()) {
            char nextChar = (c == 'z') ? 'a' : (char) (c + 1);
            nextString.append(nextChar);
        }

        return nextString.toString();
    }
}