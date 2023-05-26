package litcode.interview.questions.easy;

import litcode.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        int count = 10*10*10*10 +2;
        while((head != null) || count--> 0){
            head = head.next;
        }
        return count == 0;
    }
}
