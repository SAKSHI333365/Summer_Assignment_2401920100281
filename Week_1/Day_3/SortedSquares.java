package Week_1.Day_3;

/*

Problem:Square of a Sorted Array

Approach:
Use two pointer at both end of the array .
Compare the square of the leftmost and rightmost elements.
Place the larger square at the end of the result array and move the corresponding pointer inward.

Time Complexity: O(n)
Space Complexity:O(n)

*/

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}
