package Week_3.Day_4;

/*

Problem:Largest Rectangle in Histogram.

Approach:
Use stack to find the maximum area for each bar.

Time Complexity:O(n)
Space Complexity:O(n)

*/

public class LargestHistogram {

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && heights[st.peek()] >= currentHeight) {
                int targetIndex = st.pop();
                int height = heights[targetIndex];

                int leftBoundary = st.isEmpty() ? -1 : st.peek();

                int rightBoundary = i;

                int width = rightBoundary - leftBoundary - 1;

                int currentArea = height * width;

                maxArea = Math.max(maxArea, currentArea);

            }
            st.push(i);

        }
        return maxArea;
    }
}
