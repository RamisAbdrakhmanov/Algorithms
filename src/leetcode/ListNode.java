package leetcode;

public class ListNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode save = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(2);
        head = head.next;
        head = new ListNode(1);
    }
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}


