package Week_2.Day_5;

/*

Problem:String Compression.

Approach:
-Traverse array and count the consecutive occurences of each character.
-Write the character once.
-If count>1,write the digits of the count.
 
Time Complexity-O(n)
Space Complexity-O(1)

*/

public class StringCompression {

    public int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;

            }

            chars[index++] = currentChar;
            if (count > 1) {
                String freq = String.valueOf(count);

                for (char digit : freq.toCharArray()) {
                    chars[index++] = digit;
                }
            }
        }
        return index;
    }

}
