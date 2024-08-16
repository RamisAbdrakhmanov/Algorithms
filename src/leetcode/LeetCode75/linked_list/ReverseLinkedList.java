package leetcode.LeetCode75.linked_list;

import leetcode.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next; // отложил хвост
            head.next = prev; // понял у прошлого элемента головы ссылку на элемент стоящий впереди него
            prev = head; // зафиксировал изменения в переменной
            head = temp; // взял хвост, для продолжения манипуляций
        }

        return prev;
    }
}
