package Week_3.Day_5;

import java.util.ArrayDeque;
import java.util.Deque;

/*

Problem:Maximax in Window.

Approach:
Use deque to maintain indices of elements in decreasing order.
The front of the deque gives the maximum for each window.

Time Complexity:O(n)
Space Complexity:O(k)

*/

public class MaximumSum {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                result[index++] = nums[dq.peekFirst()];
            }
        }
        return result;
    }

}
