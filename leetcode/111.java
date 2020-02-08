import java.util.LinkedList;
import javafx.util.Pair;
import searchRangeInBinarySearchTree.TreeNode;

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

// DFS
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<Pair<TreeNode, Integer>> list = new LinkedList<>();
        list.add(new Pair(root, 1));
        int minDepth = Integer.MAX_VALUE;
        while (!list.isEmpty()) {
            Pair<TreeNode, Integer> p = list.poll();
            TreeNode node = p.getKey();
            int v = p.getValue();
            if (node.left == null && node.right == null) {
                return Math.min(v, minDepth);
            }
            if (node.left != null) {
                list.add(new Pair(node.left, v + 1));
            }
            if (node.right != null) {
                list.add(new Pair(node.right, v + 1));
            }
        }
        return minDepth;
    }
}

// Recursion,其实也是深度优先的思路
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;// 对于当前节点最小深度是0
        }
        if (root.left == null && root.right == null) {
            return 1;// 对于当前节点最小深度是1
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (root.left == null || root.right == null) {
            return l + r + 1;// 子节点最小值+本身1层；一度不理解，其实就是只要有孩子，就要继续计算下去，就是子节点的最值加上本身一层
        }
        return Math.min(l, r) + 1;// 子节点最小值+本身1层
    }
}

// BFS
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int minDepth = 0;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            minDepth++;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = list.poll();
                if (node.left == null && node.right == null) {
                    return minDepth;
                }
                if (node.left != null)
                    list.add(node.left);
                if (node.right != null)
                    list.add(node.right);
            }
        }
        return minDepth;
    }
}
