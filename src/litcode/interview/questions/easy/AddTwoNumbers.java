package litcode.interview.questions.easy;

import litcode.ListNode;
import yandex.lesson.first_1.I;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode save = l3;
        int remainder = 0;
        while (l1 != null || l2 != null || remainder != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += remainder;
            remainder = sum / 10;
            save.next = new ListNode(sum % 10);
            save = save.next;
        }
        return l3.next;
    }


}

