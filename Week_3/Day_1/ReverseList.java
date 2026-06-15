package Week_3.Day_1;

/*

Problem :Reverse Linked List

Approach:
Reverse the Linked List while traversing the list.
Use prev and curr pointers to reverse each node's next pointer.

Time Complexity: O(n)
Space Complexity:O(1)
*/
public class ReverseList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
