package Week_3.Day_5;

import java.util.Stack;

/*

Problem:Queue Using Stack

Approach:
Use two stacks.Move elements only when needed to maintain queue order.

Time Complexity:O(1)
Space Complexity:O(n)

*/
public class QueueUsingStack {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
