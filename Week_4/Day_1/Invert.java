package Week_4.Day_1;

/*

Problem :Invert Binary Tree.

Approach:
Use DFS.
Swap the left and right child of each node.

Time Complexity:O(n)
Space Complexity:O(h)

*/

public class Invert {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
