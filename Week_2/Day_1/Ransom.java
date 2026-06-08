package Week_2.Day_1;

/*

Problem:Ransom Note

Approach:
-Count the freqency of each character in magazine.
-Traverse ransomeNote and reduce the frequency.
-If any character is unavailable,return false.
-Otherwise, return true.

Time Complexity:O(m+n)
Space Complexity:O(1)

*/

public class Ransom {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        for (char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (freq[ch - 'a'] == 0) {
                return false;
            }
            freq[ch - 'a']--;
        }
        return true;
    }

}
