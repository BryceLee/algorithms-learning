import javax.swing.tree.TreeNode;

/**
 * https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
 */
public class T783 {
    public static void main(String[] a) {
    }

    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode(int x) { val = x; } }
     */
    class Solution {
        int min = Integer.MAX_VALUE;

        public int minDiffInBST(TreeNode root) {
            getMin(root);
            return min;
        }

        TreeNode lastnode;

        /**
         * @return the min
         */
        public void getMin(TreeNode root) {
            if (root == null) {
                return;
            }
            getMin(root.left);
            if (lastnode != null) {
                min = Math.min(min, root.val - lastnode.val);
            }
            lastnode = root;
            getMin(root.right);

        }
    }
}
