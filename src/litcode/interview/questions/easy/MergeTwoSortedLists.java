package litcode.interview.questions.easy;


import litcode.ListNode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        ListNode asd = list1;
        ListNode list2 = new ListNode();
        ListNode asd2 = list2;
        int count = 4;
        for (int i = 0; i < count; i++) {
            list1.val = i + 8;
            list2.val = i + 6;
            list1.next = new ListNode();
            list1 = list1.next;
            list2.next = new ListNode();
            list2 = list2.next;
        }


        ListNode listNode = new MergeTwoSortedLists().mergeTwoLists(asd2, asd);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode();
        ListNode current = merge;
        while (list1 != null && list2 != null) {
            if(list1.val<=list2.val){
                merge.next = list1;
                list1= list1.next;
            }else {
                merge.next = list2;
                list2 = list2.next;
            }
            merge = merge.next;
        }
        merge.next = list1 == null ? list2 : list1;
        return current.next;
    }
}
