package Week_3.Day_1;

/*

Problem:Linked List Cycle

Approach:
Use two pointer slow and fast.
Move slow by one step and fast by two steps.
If cycle exist both pointers will eventually meet.
If fast reaches null ,no cycle is present.

Time Complexity: O(n)
Space Complexity:O(1)
*/
public class HasCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
