package Week_2.Day_1;

/*

Problem:Valid Anagram

Approach:
-Check if both strings have same length.
-Use frequency array of size 26.
-Increment count for character in s.
-Decrement count for character in t.
-If all count becomes 0,strings are anagrams.

Time Complexity: O(n)
Space Complexity:O(1)

*/

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int ch : freq) {
            if (ch != 0) {
                return false;
            }
        }
        return true;
    }

}
