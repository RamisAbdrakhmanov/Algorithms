package leetcode.LeetCode75.linked_list;

import leetcode.ListNode;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode save = head;
        head.next = new ListNode(0);
        head = head.next;
        head.next = new ListNode(1);
        head = head.next;
        isPalindrome(save);

    }

    public static boolean isPalindrome(ListNode head) {
        int count = 0;

        ListNode a = head;
        while (a != null) {
            count++;
            a = a.next;
        }
        int countHalfOfPart = 0;
        ListNode prev = null;
        while (countHalfOfPart++ != count / 2) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        if (count > 1 && count % 2 == 1) {
            head = head.next;
        }
        while (prev != null) {
            if (prev.val != head.val) {
                return false;
            }
            prev = prev.next;
            head = head.next;
        }

        return true;
    }

}
