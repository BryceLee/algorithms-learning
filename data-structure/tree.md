# 树的基本概念
- 高度，从下往上的层级数
- 深度，从上往下的层级数
- 根结点，最上层的节点（没有父节点）
- 叶子节点，没有子字节的节点
- 度，子节点的数量 

# 二叉树
- 每个节点最多有两个子节点

# 完全二叉树
- 除了最下面一层，其他层都充满了节点，且最后一层节点靠左排列

# 满二叉树
- 所有层的节点都是满的

# 二叉搜索树（Binary Search Tree）
- 特性：左节点比当前节点小，右节点比当前节点大。
- 目的：支持动态集合快速查找，插入，删除
- 和散列表对比 （TODO）
# 红黑树
- 推荐看这篇[博客](https://mp.weixin.qq.com/s/-8JFh5iLr88XA4AJ9mMf6g)
- 特性
    - 每个节点要么是红色，要么是黑色；
    - 根节点永远是黑色的；
    - 所有的叶节点都是是黑色
    - 每个红色节点的两个子节点一定都是黑色；
    - 从任一节点到其子树中每个叶子节点的路径都包含相同数量的黑色节点；
- 不好理解的概念
    - 节点的变色
    - 节点的旋转
- 应用
    - HashMap
    - TreeMap
    - TreeSet

