package Week_4.Day_3;

/*

Problem :Search in a Binary Search Tree.

Approach:
Use BFS .
If val is smaller,move left,
else move right.

Time Complexity:O(h)
Space Complexity:O(1)

*/

public class SearchBST {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null) {

            if (root.val == val) {
                return root;
            }

            if (val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }

}
