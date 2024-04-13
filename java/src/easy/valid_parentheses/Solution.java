package easy.valid_parentheses;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] testInputs = {"()", "()[]{}", "(]", "([)]", "{[]}", "", "({{{{}}}))"};

        for (int i = 0; i < testInputs.length; i++) {
            boolean result = solution.isValid(testInputs[i]);
            System.out.println(result);
        }
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
