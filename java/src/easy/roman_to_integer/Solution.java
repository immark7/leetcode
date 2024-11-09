package easy.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(s.charAt(i));

            if (curValue >= prevValue) {
                sum += curValue;
            } else {
                sum -= curValue;
            }

            prevValue = curValue;
        }

        return sum;
    }
}
