package Week_1.Day_2;

/*

Proble: Maximum Average Subarray I

Approach: 
Use sliding window technique.
1. Calculate sum of first k elements.
2. Slide the window by removing the first element and adding the next element.
3.Keep track of maximum sum.
4. Return maxSum/k as answer.

Time Complexity: O(n)
Space Complexity:O(1)

*/

public class FindMaxAverage {
    
     public double findMaxAverage(int[] nums, int k) {
        

        int windowSum=0;

        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }

        int maxSum=windowSum;

        for(int i=k;i<nums.length;i++){

            windowSum+=nums[i];
            windowSum-=nums[i-k];

            maxSum=Math.max(maxSum,windowSum);
        }

        return (double)maxSum/k;
    }

}
