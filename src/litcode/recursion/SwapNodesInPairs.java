package litcode.recursion;

import litcode.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        return swap(head,new ListNode());
    }

    public ListNode swap(ListNode head, ListNode prev){
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head.next;
        head.next = temp.next;
        temp.next = head;
        prev.next = temp;
        swap(head.next, head);

        return temp;
    }


}
