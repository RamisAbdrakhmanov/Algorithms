package litcode.LeetCode75.linked_list;

import litcode.ListNode;

import java.util.HashMap;
import java.util.HashSet;

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
