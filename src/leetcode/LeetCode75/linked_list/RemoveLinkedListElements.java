package leetcode.LeetCode75.linked_list;

import leetcode.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        ListNode prev = head;
        head = head.next;
        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;
        }
        if (temp.val == val) {
            return temp.next;
        }
        return temp;
    }
}
