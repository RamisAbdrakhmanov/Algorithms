/*
package litcode.interview.questions.medium;

import litcode.ListNode;

public class PartitionList {
    public static void main(String[] args) {

        ListNode n = new ListNode();
        ListNode c = n;
        for (int i = 1; i < 6; i++) {
            c.val = i;
            c.next = new ListNode();
            c = c.next;
        }
        for (int i = 6; i > 0; i--) {
            c.val = i;
            c.next = new ListNode();
            c = c.next;
        }


        System.out.println(partition(n, 3));
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode l = new ListNode();
        ListNode r = new ListNode();

        ListNode left = l;
        ListNode right = r;

        while (head != null){
            if(head.val<x){
                left.next = new ListNode(head.val);
                left = left.next;
            } else {
                right.next = new ListNode(head.val);
                right = right.next;
            }
            head = head.next;
        }
        left.next = r.next;
        return l.next;
    }

}
*/
