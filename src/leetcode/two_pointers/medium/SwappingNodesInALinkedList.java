package leetcode.two_pointers.medium;

import leetcode.ListNode;

public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode prevRight = head;
        ListNode temp = head;

        for (int i = 0; i < k ; i++) {
            temp = temp.next;
        }

        while (temp != null){
            prevRight = prevRight.next;
            temp = temp.next;
        }

        ListNode prevLeft = head;
        for (int i = 0; i < k-1; i++) {
            prevLeft = prevLeft.next;
        }

        int swap = prevRight.val;
        prevRight.val = prevLeft.val;
        prevLeft.val = swap;


        return head;
    }
}
