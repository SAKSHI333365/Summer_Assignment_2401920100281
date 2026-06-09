package Week_2.Day_2;

import java.util.ArrayList;
import java.util.List;

/*

Problem:Find All Anagram in a String.

Approach:
-Use a fixed-size sliding window.
-Track character frequencies.
-Add index when freqencies match.

Time Complexity:O(n)
Space Complexity:O(1)

*/

public class FindAllAnagramInAString {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
            windowFreq[s.charAt(i) - 'a']++;
        }

        if (matches(pFreq, windowFreq)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            windowFreq[s.charAt(i) - 'a']++;
            windowFreq[s.charAt(i - p.length()) - 'a']--;

            if (matches(pFreq, windowFreq)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    private boolean matches(int[] a, int[] b) {

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

}
