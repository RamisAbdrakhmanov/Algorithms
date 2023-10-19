package litcode.LeetCode75.linked_list;

import litcode.ListNode;

import java.util.List;

public class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode prevSlow = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prevSlow.next = prevSlow.next.next;

        return head;
    }
}
