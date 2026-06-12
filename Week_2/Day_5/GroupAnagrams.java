package Week_2.Day_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*

Problem:Group Anagrams.

Approach:
-Count the frequency of each character in a string.
-Use the frequency array as the HashMap key.
-String with the same frequency conts are anagrams.
-Group them together.

Time Complexity:O(N*K)
Space Complexity:O(N*k)

*/

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] freq = new int[26];

            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int count : freq) {
                key.append('#').append(count);
            }

            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
