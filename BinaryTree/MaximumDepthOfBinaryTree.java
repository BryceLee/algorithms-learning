import java.util.LinkedList;

import javax.swing.tree.TreeNode;
//leetcode 104
public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> link = new LinkedList<>();
        link.add(root);
        int maxDepth = 0;
        while (!link.isEmpty()) { 
            maxDepth++;
            int size=link.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = link.pop();
                if (node.left != null) {
                    link.add(node.left);
                }
                if (node.right != null) {
                    link.add(node.right);
                }
            }
        }
        return maxDepth;
    }

}