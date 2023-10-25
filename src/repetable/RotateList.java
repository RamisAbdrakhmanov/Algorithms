/*
package litcode.LeetCode75.linked_list;

import litcode.ListNode;

public class RotateList {
    public static void main(String[] args) {

        ListNode n = new ListNode();
        ListNode c = n;
        for (int i = 1; i < 3; i++) {
            c.val = i;
            if (i != 5) {
                c.next = new ListNode();
                c = c.next;
            }
        }

        System.out.println(rotateRight(n, 4));
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int size = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        temp.next = head;

        int rotation = k % size;
        int skip = size - rotation;


        temp = head;
        for (int i = 0; i < skip-1; i++) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
}
*/
