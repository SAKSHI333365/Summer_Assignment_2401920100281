package Week_3.Day_1;

/*

Problem :Middle Node

Approach:
Use slow and fast pointers.
Move slow by one step and fast by two.
When fast reaches end slow will poin to the middle node.

Time Complexity:O(n)
Space Complexity:O(1)

*/
public class Middle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
