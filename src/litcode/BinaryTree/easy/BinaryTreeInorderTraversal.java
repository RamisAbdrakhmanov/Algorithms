package litcode.BinaryTree.easy;

import litcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return add(list,root);
    }

    public List<Integer> add(List<Integer> list, TreeNode root){
        if(root == null){
            return list;
        }
        list.add(root.val);
        add(list,root.left);
        add(list,root.right);
        return list;
    }
}
