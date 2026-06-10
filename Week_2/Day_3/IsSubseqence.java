package Week_2.Day_3;

/*

Problem:Is Subsequence.

Approach:
Use two pointers.
Move both pointers when character match.
Otherwise,move only the pointer in t.
If all characters of s are matched, return true.

Time Complexity:O(n+m)
Space Complexity:O(1)

*/

public class IsSubseqence {

    public boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

}
