package Week_3.Day_2;

/*

Problem: Palindrome List

Approach:
Find middle,reverse the second half,and compare both halves.

Time Complexity:O(n)
Space Complexity:O(1)

*/
public class IsPalindrome {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;
        ListNode secondCopy = secondHalf;
        boolean isPalindrome = true;
        while (secondCopy != null) {
            if (firstHalf.val != secondCopy.val) {
                return false;

            }
            firstHalf = firstHalf.next;
            secondCopy = secondCopy.next;

        }
        reverseList(secondHalf);
        return isPalindrome;
    }

    private ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
