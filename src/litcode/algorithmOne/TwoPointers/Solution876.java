package litcode.algorithmOne.TwoPointers;

public class Solution876 {
    public static void main(String[] args) {


    }

    public ListNode middleNode(ListNode head) {
        ListNode nextHead = head;
        ListNode nextAll = head;

        while(nextAll != null && nextAll.next != null){
            nextHead = nextHead.next;
            nextAll = nextAll.next.next;

        }

        return nextHead;
    }


}

