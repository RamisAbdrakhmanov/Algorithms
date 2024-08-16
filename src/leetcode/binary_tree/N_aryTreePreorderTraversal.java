package leetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePreorderTraversal {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        addToList(root, list);
        return list;
    }

    private void addToList(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.children.size() > 0) {
            for (int i = 0; i < root.children.size(); i++) {
                addToList(root.children.get(i), list);
            }
        }
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
