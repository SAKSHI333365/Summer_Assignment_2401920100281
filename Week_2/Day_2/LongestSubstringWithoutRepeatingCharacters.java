package Week_2.Day_2;

import java.util.Arrays;

/*

Problem:Longest Substring without repeating Characters

Approach:
-Use a sliding window.
-Expand the window with unique characters.
-Shrinks the window when a duplicate appears.
-Track the maximum window length.

Time Complexity: O(n)
Space Complexity:O(1)

*/

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        int[] lastIndex = new int[128];
        Arrays.fill(lastIndex, -1);

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (lastIndex[ch] >= left) {
                left = lastIndex[ch] + 1;
            }
            lastIndex[ch] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

}
