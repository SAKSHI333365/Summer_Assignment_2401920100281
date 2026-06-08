package Week_2.Day_1;

/*

Problem:First Unique Character in a String

Approach:
-Count the frequency of each character.
-Traverse the string again.
-Return the index of the first character with frequency 1.
-If no such character exists, return -1.

Time Complexity:O(n)
Space Complexity:O(1)

*/

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
