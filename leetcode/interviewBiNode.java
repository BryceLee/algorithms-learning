import java.util.LinkedList;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
class Solution {
    TreeNode prev=new TreeNode(0);
        // 1，画图分析可以发现，需要对原树左中序遍历
        // 2，如何保证原址呢？哨兵指针
    public TreeNode convertBiNode(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode head=prev;
        centerNode(root);
        return head.right;
    }
    public void centerNode(TreeNode root){
        if(root==null){
            return;
        }
        centerNode(root.left);
        //prev.left=null; 不要这样的代码！prev.right.left=null,其实就是root.left=null
        root.left=null;
        prev.right=root;
        prev=root;
        centerNode(root.right);
    }
}
// https://leetcode-cn.com/problems/binode-lcci/
class Solution {
    public TreeNode convertBiNode(TreeNode root) {
        // 1，画图分析可以发现，需要对原树左中序遍历
        // 2，如何保证原址呢？
        //  ---->先用一个链表把链表存下来. 可是不知道前驱节点，显示不行，还是选择递归
        LinkedList<TreeNode> linkedlist = new LinkedList<>();
        // getLinkedList(list, root);
        // while (!linkedlist.isEmpty()) {
        //     TreeNode p = linkedlist.poll();
        //     root=p.val;
        //     root.left=null;
        //     root.right=p
        // }
    }

    // public void getLinkedList(LinkedList<TreeNode> list, TreeNode root) {
    //     if (root == null) {
    //         return;
    //     }
    //     getLinkedList(list, root.left);
    //     list.add(root);
    //     getLinkedList(list, root.right);
    // }

}