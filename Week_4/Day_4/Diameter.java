package Week_4.Day_4;

/*

Problem :Diameter of Binary Tree.

Approach:
Use DFS recursion.

Time Complexity:O(n)
Space Complexity:O(h)

*/

public class Diameter {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;

        }
        calculate(root);
        return diameter;
    }

    private int calculate(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftH = calculate(root.left);
        int rightH = calculate(root.right);

        int currentD = leftH + rightH;
        diameter = Math.max(diameter, currentD);

        return Math.max(leftH, rightH) + 1;
    }

}
