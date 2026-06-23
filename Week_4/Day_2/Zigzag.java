package Week_4.Day_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*

Problem :Binary Tree Zigzag Order Traversal.

Approach:
Use BFS with a queue.
Traverse level by level and alternate the order of values for each level.

Time Complexity:O(n)
Space Complexity:O(n)

*/

public class Zigzag {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return result;
        }

        q.offer(root);

        boolean ltr = true;

        while (!q.isEmpty()) {
            int size = q.size();

            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();
                if (ltr) {
                    level.addLast(curr.val);
                } else {
                    level.addFirst(curr.val);
                }

                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            result.add(level);
            ltr = !ltr;
        }
        return result;
    }
}
