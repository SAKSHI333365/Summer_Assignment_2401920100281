package Week_4.Day_5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*

Problem :Serialize  Tree.

Approach:
Use  recursion.

Time Complexity:O(n)
Space Complexity:O(n)

*/

public class Serialize {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();

        if (root == null) {
            return "null,";

        }
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode node, StringBuilder sb) {

        if (node == null) {
            sb.append("null,");
            return;
        }

        sb.append(node.val).append(",");
        buildString(node.left, sb);
        buildString(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        String[] arr = data.split(",");
        Queue<String> q = new LinkedList<>(Arrays.asList(arr));
        return buildTree(q);
    }

    private TreeNode buildTree(Queue<String> q) {

        String val = q.poll();

        if (val == null || val.equals("null") || val.length() == 0) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = buildTree(q);
        node.right = buildTree(q);
        return node;
    }

}
