package litcode.interview.questions.easy;

import litcode.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = reverse;
            reverse = head;
            head = head.next;
        }
        return reverse;
    }
}
