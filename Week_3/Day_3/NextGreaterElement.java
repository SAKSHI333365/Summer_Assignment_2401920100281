package Week_3.Day_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*

Problem :Next Greater Element.

Approach:
Find next greater for each element using a stack,then answer queries using a map.

Time Complexity:O(n+m)
Space Complexity:O(n)

*/

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums2) {

            while (!st.isEmpty() && num > st.peek()) {
                map.put(st.pop(), num);
            }
            st.push(num);
        }

        while (!st.isEmpty()) {
            map.put(st.pop(), -1);
        }

        int n = nums1.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
