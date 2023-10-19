package litcode.LeetCode75.linked_list;

import litcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList {
   /* public int pairSum(ListNode head) {
        if (head == null) {
            return 0;
        }

        ListNode slow = head;
        ListNode fast = head;

        List<Integer> list = new ArrayList<>(1000);
        while (fast != null) {
            list.add(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }

        int max = Integer.MIN_VALUE;

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) + slow.val > max) {
                max = list.get(i) + slow.val;
            }
            slow = slow.next;
        }

        return max;
    }*/
    public int pairSum(ListNode head) {
        if (head == null) {
            return 0;
        }
        int count = 2;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null ) {
            count++;
            fast = fast.next.next;
            slow = slow.next;
        }

        int[] sum = new int[count];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            sum[i] += head.val;
            head = head.next;
            sum[count - 1 - i] += slow.val;
            slow = slow.next;
        }

        for (int i : sum) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
