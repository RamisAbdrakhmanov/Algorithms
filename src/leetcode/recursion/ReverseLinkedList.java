package leetcode.recursion;

import leetcode.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverseRecursion(head,null);

    }

    public ListNode reverseRecursion(ListNode head, ListNode prev) {
        if (head == null) {
            return prev;
        }
        ListNode temp = head.next;
        head.next = prev;
        prev = head;
        return  reverseRecursion(temp, prev);
    }
}
