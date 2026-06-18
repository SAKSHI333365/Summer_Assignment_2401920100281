package Week_3.Day_4;

import java.util.Stack;

/*

Problem:Reverse Polish Notation

Approach:
Use stack to evaluate operands whenever an operator is found.

Time Complexity:O(n)
Space Complexity:O(n)

*/
public class ReversePolish {

    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            } else if (token.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            } else if (token.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            } else if (token.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            } else {
                st.push(Integer.parseInt(token));
            }

        }
        return st.peek();
    }

}
