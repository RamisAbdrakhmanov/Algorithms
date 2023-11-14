package litcode.binary_tree.easy;

import litcode.TreeNode;

import java.util.HashSet;

public class TwoSumIV_InputIsBTS {
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        if(set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
}
