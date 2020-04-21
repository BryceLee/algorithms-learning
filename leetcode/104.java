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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<Pair<TreeNode, Integer>> list = new LinkedList<>();
        list.add(new Pair(root, 1));
        int depth = 0;
        while (!list.isEmpty()) {
            Pair<TreeNode, Integer> p = list.poll();
            TreeNode node = p.getKey();
            int v=p.getValue();
            depth = Math.max(depth, v);
            if (node.left != null) {
                list.add(new Pair(node.left, depth+1));
            }
            if (node.right != null) {
                list.add(new Pair(node.right, depth+1));
            }
        }
        return depth;
    }

}

// BFS
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        int depth = 0;
        while (!list.isEmpty()) {
            depth++;
            int size = list.size();//must be like this ,no like for(int i=0;i<list,size()....)
            for (int i = 0; i <  size; i++) {
                TreeNode node = list.poll();
                if (node.left != null) {
                    list.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right);
                }
            }
        }
        return depth;
    }

}

// recursion
class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepthR(root, 0);
    }

    public int maxDepthR(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }
        sum++;
        int leftH = maxDepthR(root.left, sum);
        int rightH = maxDepthR(root.right, sum);
        return Math.max(leftH, rightH);
    }
}
//recusion optimize
class Solution {
    public int maxDepth(TreeNode root) {
        return (root==null)?0:(Math.max(maxDepth(root.left), maxDepth(root.right))+1);
    }
}