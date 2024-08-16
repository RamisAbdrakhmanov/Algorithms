package leetcode.LeetCode75.linked_list;

import leetcode.ListNode;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast  == slow){
                slow = head;
               while (slow != fast){
                   slow = slow.next;
                   fast = fast.next;
               }
            }
            return slow;
        }

        return null;
    }
}
