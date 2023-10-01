package litcode.interview.questions.medium;

import litcode.ListNode;
import litcode.interview.questions.Node;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode last = head;
        List<ListNode> list = new ArrayList<>();
        int a = left;
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        left--;
        right--;
        while (left <= right) {
            int temp = list.get(left).val;
            list.get(left).val = list.get(right).val;
            list.get(right).val = temp;
            left++;
            right--;
        }


        return last;
    }

}
