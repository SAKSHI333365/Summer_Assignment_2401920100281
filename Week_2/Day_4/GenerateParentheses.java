package Week_2.Day_4;

import java.util.ArrayList;
import java.util.List;

/*

Problem:Generate Parenthese.

Approach:
-Use backtracking to build the string.
-Add '(' if open count is less than .
-Add ')' if close count is less than open count.
-When the stringlength become 2*n ,add it to ans.

Time Complexity:O(4^n/√n)
Space Complexity:O(n)

*/

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }

}
