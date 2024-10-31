package easy.isomorphic_strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, List<Integer>> sMap = new HashMap<>();
        Map<Character, List<Integer>> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.computeIfAbsent(s.charAt(i), k -> new ArrayList<>())
                    .add(i);
            tMap.computeIfAbsent(t.charAt(i), k -> new ArrayList<>())
                    .add(i);
        }

        for (int i = 0; i < s.length(); i++) {
            if (!sMap.get(s.charAt(i))
                    .equals(tMap.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
