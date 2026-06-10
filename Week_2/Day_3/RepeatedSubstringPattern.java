package Week_2.Day_3;

/*

Problem:Repeated Substring Pattern

Approach:
Concatenate the string with itself.
Remove the first and last character.
If the original string exits in new string ,return true.

Time Complexity:O(n)
Space Complexity:O(n)

*/

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {

        String doubled = s + s;
        String trimmed = doubled.substring(1, doubled.length() - 1);
        return trimmed.contains(s);
    }

}
