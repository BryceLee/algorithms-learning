import javax.swing.tree.TreeNode;

/**
 * https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/
 */
public class T938 {
    public static void main(String[] a) {
    }

    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode(int x) { val = x; } }
     */
    class Solution {
        int sum=0;//反向中序遍历，记得巧用变量存值
        public TreeNode bstToGst(TreeNode root) {
            if(root==null){
                return null;
            }
            bstToGst(root.right);
            root.val+=sum;
            sum=root.val;
            bstToGst(root.left);
            return root;
        }
       
    }
}
