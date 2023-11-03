package litcode.LeetCode75.HashMapSet;

import litcode.TreeNode;

import java.util.*;

public class FindDuplicateSubtrees {

    Map<String, Integer> map = new HashMap<>();
    ArrayList<TreeNode> res = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        putAndSearchNode(root);
        return res;
    }

    public String putAndSearchNode(TreeNode root) {
        if (root == null) {
            return "";
        }
        String left = putAndSearchNode(root.left);
        String right = putAndSearchNode(root.right);

        String curr = root.val + " " + left + " " + right;

        map.put(curr,map.getOrDefault(curr, 0) + 1);
        if(map.get(curr) == 2){
            res.add(root);
        }
        return curr;
    }

}
