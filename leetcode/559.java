import java.util.LinkedList;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

// Recursion,其实也是DFS,tims complexity:worst->O(n),best->O(log(N)),
class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null) {
            return 1;
        }
        int maxDepth = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int d = maxDepth(root.children.get(i));
            maxDepth=Math.max(maxDepth, d);
        }
        return maxDepth+1;
    }
}

// BFS time complexity: O(N), space complexity: O(n)
class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        LinkedList<Node> list = new LinkedList<>();
        int depth = 0;
        list.add(root);
        while (!list.isEmpty()) {
            depth++;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Node node = list.pollFirst();
                if (node != null && node.children != null) {
                    list.addAll(node.children);
                }
            }
        }
        return depth;
    }
}