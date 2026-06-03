/* 
Problem: Two Sum

Approach: 
Use a HashMap to store numbers and their indices.
For each number,check whether its complement(target-number) exists in the map.If it does,return the indices of the current number and its complement.


Time Complexity:  O(n)
Space Complexity: O(n)
 */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        int[] result = ts.twoSum(new int[] { 2, 7, 11, 15 }, 9);

        System.out.println(Arrays.toString(result));

    }
}
