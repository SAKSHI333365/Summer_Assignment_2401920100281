package Week_4.Day_1;

/*

Problem :Maximum Depth of Binary Tree.

Approach:
Use DFS.
Find the depth of the left and right subtrees, then return 1+the greater of the two depths.

Time Complexity:O(n)
Space Complexity:O(n)

*/

public class MaximumDepth {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

}
