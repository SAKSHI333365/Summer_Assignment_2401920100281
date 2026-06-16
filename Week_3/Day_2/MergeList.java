package Week_3.Day_2;

/*

Problem:Merge Two Sorted List

Approach:
Compare both lists and attach the smaller node each time.

Time Complexity:O(n+m)
Space Complexity:O(1)

*/
public class MergeList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headDummy = new ListNode(-1);
        ListNode dummy = headDummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummy.next = list1;
                list1 = list1.next;
                dummy = dummy.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
                dummy = dummy.next;
            }
        }
        dummy.next = (list1 != null) ? list1 : list2;
        return headDummy.next;
    }

}
