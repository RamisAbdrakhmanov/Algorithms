package litcode.interview.questions.medium;

import litcode.ListNode;

import java.util.List;

public class RemoveDuplicateFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prevPrev = null;
        ListNode prev = null;
        ListNode curr = head;


        while (curr != null) {
            prevPrev = prev;
            prev = curr;
            boolean mark = false;
            if (curr.next != null && curr.next.val == prev.val) {
                curr = curr.next;
                mark = true;
            }
            if (mark) {
                if (prevPrev == null) {
                    head = curr.next;
                    prev = null;
                    prevPrev = null;
                } else {
                    prev = prevPrev;
                    prevPrev.next = curr.next;
                }
            }
            curr = curr.next;

        }

        return head;
    }
}
