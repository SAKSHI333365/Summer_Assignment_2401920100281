package Week_1.Day_2;

/*
Problem:Maximum Subarray

Aprroach:
Use Kadane's Algorithm.
At each index decide whether to :
1.Start a new subarray from current element.
2.Extend the previous subarray.

Time Complexity: O(n)
Space Complexity:O(1)

*/

public class MaxSubArray {
    
     public int maxSubArray(int[] nums) {
        
       int currentSum=nums[0];
       int maxSum=nums[0];

       for(int i=1;i<nums.length;i++){

        currentSum=Math.max(nums[i],currentSum+nums[i]);
        
        maxSum=Math.max(maxSum,currentSum);
       }
       return maxSum;
    }

}
