package easy.ransom_note;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!freqMap.containsKey(c) || freqMap.get(c) == 0) {
                return false;
            }
            freqMap.put(c, freqMap.get(c) - 1);
        }

        return true;
    }
}