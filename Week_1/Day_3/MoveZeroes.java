package Week_1.Day_3;

/*

Problem: Move Zeroes

Approach:
Use two pointers.
Pointer j scan the array.
Pointer i keep track of the position where the next non-zero element should be placed.
First move all non-zero element to the front ,then fill the remaining position with the zeroes.

Time Complexity: O(n)
Space Complexity: O(1)


*/

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

}
