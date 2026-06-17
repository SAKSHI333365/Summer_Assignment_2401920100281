package Week_3.Day_3;

import java.util.Stack;

/*

Problem :Min Stack

Approach:
Store value  and current minimum in each stack node.

Time Complexity:O(1)
Space Complexity:O(n)

*/
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }

    }

    public void pop() {
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minStack.peek();
    }
}
