/*
package litcode.BinaryTree.easy;

import litcode.TreeNode;

import java.util.PriorityQueue;

public class MinimumAbsoluteDifferenceInBTS {

    public int getMinimumDifference(TreeNode root) {
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        addToPR(pr, root);
        int min = Integer.MAX_VALUE;
        if(pr.isEmpty()){
            return 0;
        }
        int prev = pr.poll();
        while (!pr.isEmpty()) {
            int numb = pr.poll();
            int tempMin = Math.abs(prev - numb);
            if (tempMin < min) {
                min = tempMin;
            }
            prev = numb;
        }
        return min;
    }

    public void addToPR(PriorityQueue<Integer> pr, TreeNode node) {
        if (node == null) {
            return;
        }

        pr.add(node.val);
        addToPR(pr, node.left);
        addToPR(pr, node.right);
    }


}
*/
