package litcode.LeetCode75.linked_list;

public class FlattenAMultilevelDoublyLinkedList {
    public static void main(String[] args) {
        Node n = new Node(1, null, null, null);
        Node save = n;
        n.next = new Node(2, n, null, null);
        n = n.next;
        n.next = new Node(3, n, null, null);
        n = n.next;
        Node temp = n;
        n.next = new Node(4, n, null, null);
        n = n.next;
        n.next = new Node(5, n, null, null);
        n = n.next;
        n.next = new Node(6, n, null, null);


        Node m = new Node(7, null, null, null);
        temp.child = m;
        m.next = new Node(8, m, null, null);
        m = m.next;
        temp = m;
        m.next = new Node(9, m, null, null);
        m = m.next;
        m.next = new Node(10, m, null, null);


        Node s = new Node(11, null, null, null);
        temp.child = s;
        s.next = new Node(12, s, null, null);

        Node l = flatten(save);
        while (l != null){
            System.out.print(l.val + " : ");
            l = l.next;
        }
    }
    public static Node flatten(Node head) {
        if (head == null){
            return null;
        }
        Node p = head;
        while (p != null ) {

            if(p.child == null) {
                p = p.next;
                continue;
            }

            Node temp = p.child;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = p.next;
            if(p.next != null){
                p.next.prev = temp;
            }
            p.next = p.child;
            p.child.prev = p;
            p.child = null;
        }
        return head;
    }
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val, Node prev, Node next,Node child) {
            this.val = val;
            this.prev = prev;
            this.next = next;
            this.child = child;
        }
    }
}


