/*
package litcode.LeetCode75.linked_list;

public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        Node cur = head;
        while (cur != null){
            Node temp = new Node(cur.val, cur.next);
            cur.next = temp;
            cur = temp.next;
        }

        cur = head;
        while (cur != null){
            if(cur.random != null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        Node old = head;
        Node newNode = head.next;
        Node newHead = newNode;

        while (old != null){
            old.next = old.next.next;
            newNode.next = newNode.next != null ? newNode.next.next : null;
            old = old.next;
            newNode = newNode.next;
        }
        return newHead;
    }
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val, Node next) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}


*/
