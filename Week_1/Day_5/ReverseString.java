package Week_1.Day_5;

/*

Problem: Reverse String

Approach:
Use two pointers:
-left starts at the beginning of the array.
-right starts at the end of the array.

Swap the character at left and right.
Move left forward and right backward.

Continue until the pointers meet.

Time Complexity :O(n)
Space Complexity:O(1)

*/

public class ReverseString {
    
    public void reverseString(char[] s) {
        
        int left=0;
        int right=s.length-1;

        while(left<right){

            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right--;
        }
    }

}
