package Week_4.Day_2;

import java.util.ArrayList;
import java.util.List;

/*

Problem :Inorder Traversal.

Approach:
Use DFS recursion.
Traverse the left subtree,visit the current node, then  traverse the right subtree.

Time Complexity:O(n)
Space Complexity:O(h)

*/

public class InorderTraversal {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);

    }

}
