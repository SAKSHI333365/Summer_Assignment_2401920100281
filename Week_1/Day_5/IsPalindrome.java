package Week_1.Day_5;

/*

Problem: Valid Palindrome

Approach:
Use two pointers:
-left start from the beginning of the string.
-right starts from the end of the string.

Skip all non-alphanumeric characters from both sides.
Convert character to lowercase before comparing.

If any pair of characters does not match,
return false.

If all character match until the pointers meet,
return true.

Time Complexity: O(n)
Space Complexity:O(1)

*/

public class IsPalindrome {
    
     public boolean isPalindrome(String s) {
        
        int left=0;
        int right=s.length()-1;

        while(left<right){

            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }
        return  true;
    }

}
