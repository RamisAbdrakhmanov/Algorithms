package leetcode.LeetCode75.binary_tree;

import leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class MaximumLevelSumOfABinaryTree {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int maxLevelSum(TreeNode root) {
        fillMap(root,1);

        int max = Integer.MIN_VALUE;
        int lvl = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                lvl = entry.getKey();
            }
        }
        return lvl;
    }

    public void fillMap(TreeNode root, int lvl){
        if(root == null){
            return;
        }

        map.put(lvl, map.getOrDefault(lvl,0)+ root.val);
        fillMap(root.left,lvl+1);
        fillMap(root.right,lvl+1);
    }
}
