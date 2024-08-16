package leetcode.LeetCode75.linked_list;

public class DesignLinkedList {
    int length;
    Node head;
    Node tail;

    public DesignLinkedList() {
        length = 0;
        head = new Node();
        tail = head;
    }


    public int get(int index) {
        Node node = head;
        while (index-- >= 0) {
            node = node.next;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        head = new Node(val, head);
        length++;
    }

    public void addAtTail(int val) {
        tail.next = new Node(val);
        tail = tail.next;
        length++;
    }

    public void addAtIndex(int index, int val) {
        Node node = head;
        while (index-- > 0) {
            node = node.next;
        }
        Node temp = node.next;
        node.next = new Node(val, temp);
        length++;

    }

    public void deleteAtIndex(int index) {
        Node node = head;
        while (index-- > 0) {
            node = node.next;
        }
        node.next = node.next.next;
    }

    class Node {
        int val;
        Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}


