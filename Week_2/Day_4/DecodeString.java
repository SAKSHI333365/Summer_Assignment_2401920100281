package Week_2.Day_4;

import java.util.Stack;

/*

Problem:Decode Strings.

Approach:
-Use one stack for number and one stack for strings.
-When a digit is found,build the repeat count.
-when '[' is found save current string and count.
-when ']' is found,repeat the current string count times.
-Append the repeated string to the previous string.

Time Complexity:O(n)
Space Complexity:O(n)

 */

public class DecodeString {

    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();

        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(current);
                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder previous = stringStack.pop();

                for (int i = 0; i < repeat; i++) {
                    previous.append(current);
                }
                current = previous;
            } else {
                current.append(ch);
            }
        }
        return current.toString();
    }

}
