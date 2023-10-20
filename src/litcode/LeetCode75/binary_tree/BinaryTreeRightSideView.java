package litcode.LeetCode75.binary_tree;

import litcode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryTreeRightSideView {
   HashMap<Integer,Integer> map = new HashMap<>();
    public List<Integer> rightSideView(TreeNode root) {
        addToList(root, 0);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (map.containsKey(i)){
            list.add(map.get(i++));
        }
        return list;
    }

    public void addToList(TreeNode node, int count){
        if(node ==null){
            return;
        }
        if(!map.containsKey(count)){
            map.put(count,node.val);
        }

            addToList(node.right,count+1);
            addToList(node.left,count+1);
    }
}
