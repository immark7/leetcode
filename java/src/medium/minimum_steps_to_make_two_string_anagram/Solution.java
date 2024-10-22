package medium.minimum_steps_to_make_two_string_anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> freqMap = new HashMap<>();
        int steps = 0;

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) - 1);
        }

        for (int freq : freqMap.values()) {
            if (freq > 0) {
                steps += freq;
            }
        }

        return steps;
    }
}
