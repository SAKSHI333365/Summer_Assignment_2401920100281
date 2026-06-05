package Week_1.Day_2;

import java.util.HashSet;

/*

Problem: Contains Duplicate

Approach:
Use a HashSet to store elelments while iterating through the array.
If a element is already exist in set, return true immediately.
If we finish traversal without duplicates, return false

Time Complexity: O(n)
Space Complexity:O(n)

*/

public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        
      HashSet<Integer> set=new HashSet<>();
      
    for(int num:nums){

        if(set.contains(num)){
            return true;
        }
        set.add(num);
    }

    return false;
    }

}
