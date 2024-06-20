package easy.valid_anagram;

import java.util.HashMap;
import java.util.Map;

// HashMap
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            charCountMap.put(c1, charCountMap.getOrDefault(c1, 0) + 1);
            charCountMap.put(c2, charCountMap.getOrDefault(c2, 0) - 1);

        }

        for(int count : charCountMap.values()){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
}
