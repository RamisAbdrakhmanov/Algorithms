package litcode.interview.questions.easy;

import litcode.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        int a = ((l1.val + l2.val) % 10) + remainder;
        remainder = (l1.val + l2.val) / 10;
        l1 = l1.next;
        l2 = l2.next;
        ListNode ans = new ListNode(a, null);
        ListNode ansFirst = ans;

        while (l1 != null || l2 != null) {
            ans.next = new ListNode();
            ans = ans.next;

            if (l1 == null) {
                a = (l2.val + remainder) % 10;
                remainder = (l2.val + remainder) / 10;
                if (l2.next == null) {
                    l2 = null;
                } else {
                    l2 = l2.next;
                }
            } else if (l2 == null) {
                a = (l1.val + remainder) % 10;
                remainder = (l1.val + remainder) / 10;
                if (l1.next == null) {
                    l1 = null;
                } else {
                    l1 = l1.next;
                }
            } else {
                a = (l2.val + l1.val + remainder) % 10;
                remainder = (l2.val + l1.val + remainder) / 10;

                if (l2.next == null) {
                    l2 = null;
                } else {
                    l2 = l2.next;
                }

                if (l1.next == null) {
                    l1 = null;
                } else {
                    l1 = l1.next;
                }
            }
            ans.val = a;

        }
        if(remainder != 0){
            ans.next = new ListNode(remainder);
        }

        return ansFirst;
    }


}

