package Week_3.Day_3;

import java.util.Stack;

/*

Problem :Middle Node

Approach:
Use stack to match opening and closing brackets.

Time Complexity:O(n)
Space Complexity:O(n)

*/
public class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{'))
                    return false;

            }
        }
        return stack.isEmpty();
    }

}
