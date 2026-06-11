package Week_2.Day_4;

/*

Problem: Reverse Words in String

Approach:
-Traverse each word in string.
-Reverse the character of current word.
-Repeat for all words.

Time Complexity:O(n)
Space Complexity:O(n)

*/

public class ReverseWordsInString {

    public String reverseWords(String s) {

        char[] arr = s.toCharArray();

        int n = arr.length;

        int start = 0;

        while (start < n) {
            while (start < n && arr[start] == ' ') {
                start++;
            }

            int end = start;

            while (end < n && arr[end] != ' ') {
                end++;
            }

            reverse(arr, start, end - 1);
            start = end;
        }
        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
