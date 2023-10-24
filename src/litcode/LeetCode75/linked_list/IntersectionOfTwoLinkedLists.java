package litcode.LeetCode75.linked_list;

import litcode.ListNode;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lengthA = length(tempA);
        int lengthB = length(tempB);

        if(lengthA>lengthB){
            while (lengthA != lengthB){
                headA = headA.next;
                lengthA--;
            }
        }else {
            while (lengthA != lengthB){
                headB = headB.next;
                lengthB--;
            }
        }

        while (headA != headB){
            headA = headA.next;
            headB =  headB.next;
            if(headA == null || headB == null){
                return null;
            }
        }
        return headA;
    }

    int length(ListNode head){
        int count = 0;
        while (head != null){
            head = head.next;
            count++;
        }
        return count;
    }
}
