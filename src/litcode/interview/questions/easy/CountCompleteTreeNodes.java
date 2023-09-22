package litcode.interview.questions.easy;

import litcode.TreeNode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
