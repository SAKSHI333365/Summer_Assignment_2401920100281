package Week_4.Day_3;

/*

Problem :Validate Binary Search Tree.

Approach:
Use  DFS with min and max bounds.

Time Complexity:O(n)
Space Complexity:O(h)

*/

public class IsValidBST {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root, long min, long max) {

        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }
}
