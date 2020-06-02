import javax.swing.tree.TreeNode;

public class Solution {

//    https://leetcode.com/problems/maximum-depth-of-binary-tree/

    public int maxDepth(TreeNode root) {

        // My code starts here
        if (root == null) {
            return 0;
        }
        return Math.max( maxDepth(root.left), maxDepth(root.right)) + 1;
        // My code ends here

        // Alternate solution
        // My code starts here
        if (root == null) {
            return 0;
        }
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return Math.max(left_depth, right_depth) + 1;
        // My code ends here

    }

}
