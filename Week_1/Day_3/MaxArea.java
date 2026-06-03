package Week_1.Day_3;

/*

Problem:Container With Most Water

Approach:
Use two pointer at both end of the array .
Calculate the area formed by the two lines. 
Move the pointer having the smallest height because the smaller height limits the water capacity .

Time Complexity:O(n)
Space Complexity:O(1)
*/

public class MaxArea {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            int width = right - left;

            int currArea = Math.min(height[left], height[right]) * width;

            maxArea = Math.max(maxArea, currArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
