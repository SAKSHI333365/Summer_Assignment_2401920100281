package Week_4.Day_4;

/*

Problem :Max Path Sum of Binary Tree.

Approach:
Use DFS recursion.

Time Complexity:O(n)
Space Complexity:O(h)

*/

public class MaxPathSum {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        calculate(root);
        return maxSum;
    }

    private int calculate(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftG = Math.max(0, calculate(root.left));
        int rightG = Math.max(0, calculate(root.right));

        int currentG = leftG + rightG + root.val;

        maxSum = Math.max(maxSum, currentG);

        return root.val + Math.max(leftG, rightG);
    }
}
