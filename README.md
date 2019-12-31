# algorithms-learning

## Leetcode Java Solutions

| sort| Title| Classify |
|----|--------------------|-----------|
|1    | [two sum][001]                           | Array                 |
|11    | [container with most water][011]| Two Pointers|
|15|[3Sum][015]|Two Poniters|
|20|[valid parentheses][020]|
|26|[remove duplicates from sorted array][026]|Array
|27|[remove element][027]|Array,Two Pointers
|35|[search insert position][035]|Binary Search
|53| [maximum subarray][053]|Array
|687| [longest-univalue-path][687]|Recursion
|783| [minimum-distance-between-bst-nodes][783]|Recursion,Binary Search Tree
|938| [range-sum-of-bst][938]|Recursion,Binary Search Tree


[001]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/001.md
[011]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/011.md
[015]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/015.md
[020]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/020.md
[026]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/026.md
[027]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/027.md
[035]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/035.md
[053]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/053.md
[687]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/687.md
[783]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/783.md
[938]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/938.md
## HEAP
- 堆必须是一个完全二叉树。完全二叉树要求，除了最后一层，其他层的节点个数都是满的，最后一层的节点都靠左排列。
- 堆中的每个节点的值必须大于等于（或者小于等于）其子树中每个节点的值
- 可以应用于PriorityQueue,求最值，求中位数等场景 
## Stack
## Queue
## [Tree](https://github.com/BryceLee/algorithms-learning/blob/master/data-structure/tree.md)
## Graph
## 递归（recursion）
- 层级
- 终止条件
## 分治（-Divide&Conquer）
- Divide:Problem-->SubProblem1,SubProblem2...
- Conquer:SubProblem1-->Answer1,SubProbelm2-->Answer2.....
- Merge:Answer1+Answer2+...=Answer
## Brandth-First-Search(base on Graph)
## Deepth-First-Search(base on Graph)
## 动态规划
- 条件
    - 可以分治
- 存储每一步的决定，可回退
## 贪心算法
- 条件
    - 可以分治
- 每次都决定一个当前最优选项
- 缺点：解决的问题范围小，不可修改做过的决定
## 排序(sort)

- 涉及的概念
    - 有序度，是有序元素对的数量，有序元素对满足，如果i<j，则a[i]<=a[j]
    - 逆序度,是逆序对的数量，满足如果i<j,则a[i]>a[j]
    - 满有序度，其中满有序度=有序度+逆序度
- 一般会从这几个方面比较不同的排序算法
    - 最好，最坏，平均的时间复杂度情况
    - 时间复杂度系数，常数，低阶
    - 比较次数，交换次数
- 各排序复杂度情况
![](https://static001.geekbang.org/wechat/images/28/28f8f7971b1f226775a563ddb63184ed.png)
- 冒泡排序
    - 原理：每次遍历比较交换元素，找到最值，放到末尾。
    - 比较或者交换的时候有序度加1，交换总次数是n*(n-1)/2-初始有序度,也就是逆序度。
    - 稳定性：
        - 稳定，因为大小相等不做交换。
    - 复杂度
        - 时间
            - 最好情况，不需要交换，一次冒泡，时间复杂度O(n)
            - 最坏情况，是目标顺序的逆序，时间复杂度O(n^2)
        - 空间
            - 平均情况下比较次数取中间值:n*(n-1)/4，取平均时间复杂度O(n^2)（非严格推导的复杂度）
            - 空间复杂度上仅需要常量级的临时空间，是O(1),是原地排序算法。
- 插入排序
    - 适用于少量元素的排序
    - 有点冒泡升级版本的意味，也涉及到比较和移动元素。交换次数也是逆序度。
    - 原理：分为两个区间，一个为排序区间，一个为未排序区间，初始状态下排序区间只有第一个元素，如果把第二个元素，也就是未排序区间的第一个元素，加入到排序区间中排序，然后继续拿未排序区间的第一个元素，加入排序区间去排序，直到完成排序。像扑克牌，抽牌插入手牌中排序。（算法实现上，要插入数据，是从排序区间的尾部开始比较。）
    - 复杂度
        - 空间
            - 空间复杂度是O（1），是一个原地排序算法
        - 时间
            - 最好情况下，就是排好序的情况，每个数都比较一次即插入到本身位置，时间复杂度是O（n）
            - 最坏情况下，正好是目标顺序的逆序，每次插入都在数组的首位插入，时间复杂度是O(n^2)
            - 平均情况下，O(n^2)
    - 由于冒泡排序，虽然复杂度和交换次数一样；但是冒泡每次交换数据，都需要三次赋值操作，而插入排序仅需要一次赋值操作。
    - 稳定性：
        - 稳定，对于相同大小的值，先出现的排在前面。
- 选择排序
    - 原理：分为排序和未排序区间，每次都从未排序区间拿到最值，然后放到排序区间尾部。
    - 空间复杂度O（1）
    - 时间复杂度最坏最好平均都是O(n^2)
    - 稳定性：
        - 不稳定，“选择排序是一种不稳定的排序算法，比如5，8，5，2，9这样一组数据，使用选择排序算法来排序的话，第一次找到最小元素2，与第一个5交换位置，那第一个5和中间的5顺序就变了，所以就不稳定了。正是因此，相对于冒泡排序和插入排序，选择排序就稍微逊色了”（引入自数据结构和算法之美）。
- 归并排序
    - 总是一分为二处理，处理好了再合并。分治思路+递归实现。
    - 示例代码如下：
```
public class mergesort {

  public static void main(String[] arg) {
    int[] a = new int[]{1, 9, 20, 2, 15, 8};
    mergeSort(a, a.length);
    for (int i = 0; i < a.length; i++) {
      System.out.println("a=" + a[i]);
    }
  }

  // 归并排序算法, a是数组，n表示数组大小
  public static void mergeSort(int[] a, int n) {
    mergeSortInternally(a, 0, n - 1);
  }

  // 递归调用函数,s是start,e是end
  private static void mergeSortInternally(int[] a, int s, int e) {
    // 递归终止条件
    if (s >= e) {
      return;
    }

    // 取s到e之间的中间位置m,防止（s+e）的和超过int类型最大值
    int m = s + (e - s) / 2;
    // 分治递归
    mergeSortInternally(a, s, m);
    mergeSortInternally(a, m + 1, e);

    // 将A[s...m]和A[m+1...e]合并为A[s...e]
    merge(a, s, m, e);
    //    mergeBySentry(a, s, m, e);
  }

  private static void merge(int[] a, int s, int m, int e) {
    int i = s;
    int j = m + 1;
    int k = 0; // 初始化变量i, j, k
    int[] tmp = new int[e - s + 1]; // 申请一个大小跟a[s...e]一样的临时数组
    while (i <= m && j <= e) {
        //用极限思维方便理解，当a的长度是2.
      if (a[i] <= a[j]) {
        tmp[k++] = a[i++]; // i++等于i:=i+1
      } else {
        tmp[k++] = a[j++];
      }
    }

    // 判断哪个子数组中有剩余的数据
    int start = i;
    int end = m;
    if (j <= e) {
      //后半段剩下来
      start = j;
      end = e;
    }

    // 将剩余的数据拷贝到临时数组tmp
    while (start <= end) {
      tmp[k++] = a[start++];
    }

    // 将tmp中的数组拷贝回a[p...r]
    for (i = 0; i <= e - s; ++i) {
      a[s + i] = tmp[i];
    }
  }

  /**
   * 合并(哨兵)
   */
  private static void mergeBySentry(int[] arr, int s, int m, int e) {
    int[] leftArr = new int[m - s + 2];
    int[] rightArr = new int[e - m + 1];

    for (int i = 0; i <= m - s; i++) {
      leftArr[i] = arr[s + i];
    }
    // 第一个数组添加哨兵（最大值）
    leftArr[m - s + 1] = Integer.MAX_VALUE;

    for (int i = 0; i < e - m; i++) {
      rightArr[i] = arr[m + 1 + i];
    }
    // 第二个数组添加哨兵（最大值）
    rightArr[e - m] = Integer.MAX_VALUE;

    int i = 0;
    int j = 0;
    int k = s;
    while (k <= e) {
      // 当左边数组到达哨兵值时，i不再增加，直到右边数组读取完剩余值，同理右边数组也一样
      if (leftArr[i] <= rightArr[j]) {
        arr[k++] = leftArr[i++];
      } else {
        arr[k++] = rightArr[j++];
      }
    }
  }

}
```
- 快排
## 二分查找（Binary Search）
- 条件  
    - sorted（递增或递减）
    - 可以通过下标找到数据
- 时间复杂度O(log2（n）)（以2为底，n的对数）
## Cache
- LRU
    - 新增数据被添加到链表头部，添加满了，最后的数据是被丢弃。[Lru](https://github.com/CyC2018/CS-Notes/blob/master/notes/%E8%AE%A1%E7%AE%97%E6%9C%BA%E6%93%8D%E4%BD%9C%E7%B3%BB%E7%BB%9F%20-%20%E5%86%85%E5%AD%98%E7%AE%A1%E7%90%86.md#2-%E6%9C%80%E8%BF%91%E6%9C%80%E4%B9%85%E6%9C%AA%E4%BD%BF%E7%94%A8)
# 推荐阅读
- [真正支配世界的十种算法](https://www.infoq.cn/article/mBKst3xjImwCqm5YPXOA)
# Thanks:
- 数据结构与算法之美
- [CS-Notes](https://github.com/CyC2018/CS-Notes/blob/master/notes/%E8%AE%A1%E7%AE%97%E6%9C%BA%E6%93%8D%E4%BD%9C%E7%B3%BB%E7%BB%9F%20-%20%E5%86%85%E5%AD%98%E7%AE%A1%E7%90%86.md#1-%E6%9C%80%E4%BD%B3)
- [s32n/algorithm](https://github.com/s32n/algorithm)
- [坐在马桶上学算法](http://wiki.jikexueyuan.com/project/easy-learn-algorithm/fast-sort.html)

