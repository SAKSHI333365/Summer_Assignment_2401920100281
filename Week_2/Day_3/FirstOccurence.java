package Week_2.Day_3;

/*

Problem:Find the index of first occurence in string.

Approach:
-Check every possible starting position in haystack.
-For each position compare characters of needle one by one.
-If all character match,return the starting index.
-If no match is found ,return -1.

Time Complexity:O(n*m)
Space Complexity:O(1)

*/

public class FirstOccurence {

    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

}
