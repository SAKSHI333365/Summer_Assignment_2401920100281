package Week_4.Day_4;

/*

Problem :Path Sum.

Approach:
Use DFS recursion.

Time Complexity:O(n)
Space Complexity:O(h)

*/

public class PathSum {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int remainingSum = targetSum - root.val;

        return hasPathSum(root.left, remainingSum)
                || hasPathSum(root.right, remainingSum);
    }
}
