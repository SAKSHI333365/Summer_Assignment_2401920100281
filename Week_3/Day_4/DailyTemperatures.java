package Week_3.Day_4;

import java.util.Stack;

/*

Problem:Daily Temperatures

Approach:
Use a stack to find the next warmer day's index.

Time Complexity:O(n)
Space Complexity:O(n)

*/
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }
        return ans;
    }

}
