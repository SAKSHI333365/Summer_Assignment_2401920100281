package Week_2.Day_5;

/*

Problem:Longest Palindrome.

Approach:
-Treat each character as the center of palindrome.
-Expand outward while the characters match.
-Check both even and odd length.

Time Complexity:O(n2)
Space Complexity:O(1)

*/

public class LongestPalindrome {

    public String longestPalindrome(String s) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            int oddLength = expandAroundCenter(s, i, i);
            int evenLength = expandAroundCenter(s, i, i + 1);
            int maxLength = Math.max(oddLength, evenLength);

            if (maxLength > end - start + 1) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
