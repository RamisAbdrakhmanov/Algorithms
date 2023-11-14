/*
package litcode.BinaryTree.easy;

import litcode.TreeNode;

import java.util.List;

public class CousinsInBinaryTree {

    public boolean isCousins(TreeNode root, int x, int y) {

    }

    public int lvl(TreeNode node, int v,int sum){
        if (node == null){
            return sum;
        }
        sum++;
        lvl(node.left,v, sum);
        lvl(node.right,v,sum);

        if (node.val == v){
            return sum;
        }

        return
    }
}
*/
