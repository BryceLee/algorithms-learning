# algorithms-learning

## Leetcode Java Solutions

| sort| Title| Classify |Solutions|
|----|--------------------|-----------|-----
|1    | [two sum][001]                           | Array       |[java][001]|
|2    | [Add Two Numbers][002]| LinkedList|[java][002]
|3    | [Longest Substring Without Repeating Characters][003]| Two Pointers|[java][003]
|7    | [Reverse Integer][007]| Math|[java][007]
|9    | [Palindrome Number  ][009]| Two Pointers|[java][009]
|11    | [container with most water][011]| HashTable,Two Pointers,String,SlidingWindow|[java][011]
|15|[3Sum][015]|Two Poniters|[java][015]
|20|[valid parentheses][020]||[java][020]|
|[21](https://leetcode-cn.com/problems/merge-two-sorted-lists/)|[Merge Two Sorted Lists][021]|LinkedList|[java][021]
|26|[remove duplicates from sorted array][026]|Array|[java][026]
|27|[remove element][027]|Array,Two Pointers|[java][027]
|35|[search insert position][035]|Binary Search|[java][035]
|53| [maximum subarray][053]|Array|[java][053]
|66| [Plus One][066]|Array|[java][066]
|69| [Sqrt(x)][069]|Math|[java][069]
|[70](https://leetcode-cn.com/problems/climbing-stairs/)| [climbing-stairs][070]|Dynamic Programming|[java][070]
|[104]()| [ Maximum Depth of Binary Tree][104]|Tree|[java][104]
|[121](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/)| [ Best Time to Buy and Sell Stock][121]|Array,Dynamic Programming|[java][121]
|[122](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/)| [Best Time to Buy and Sell Stock II][122]|Array,Greedy|[java][122]
|[136](https://leetcode-cn.com/problems/single-number/)| [Single Number][136]|Math|[java][136]
|141|[linked-list-cycle][141]|LinkedList,Two Pointers|[java][141]
|142|[linked-list-cycle2][142]|LinkedList,Two Pointers|[java][142]
|160|[Intersection of Two Linked Lists][160]|LinkedList|[java][160]
|206|[Reverse Linked List][206]|LinkedList|[java][206]
|[225](https://leetcode-cn.com/problems/implement-stack-using-queues/)|[Implement Stack using Queues][225]|Stack|[java][225]
|[232](https://leetcode-cn.com/problems/implement-queue-using-stacks/submissions/)|[ Implement Queue using Stacks][232]|Stack|[ java][232]
|[349](https://leetcode-cn.com/problems/intersection-of-two-arrays/)|[ Intersection of Two Arrays][349]|Sort,HashTable,Two Pointers|[ java][349]
|687| [longest-univalue-path][687]|Recursion|[java][687]
|783| [minimum-distance-between-bst-nodes][783]|Recursion,Binary Search Tree| [java][783]
|938| [range-sum-of-bst][938]|Recursion,Binary Search Tree|[java][938]
|[1038](https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/)| [binary-search-tree-to-greater-sum-tree][1038]|Binary Search Tree|[java][1038]
|[1046](https://leetcode-cn.com/problems/last-stone-weight/)| [last-stone-weight][1046]|Heap,Greedy|[java][1046]

[001]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/001.md
[002]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/002.md
[003]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/003.md
[007]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/007.md
[009]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/009.md
[011]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/011.md
[015]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/015.md
[020]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/020.md
[021]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/021.md
[026]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/026.md
[027]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/027.md
[035]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/035.md
[053]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/053.md
[066]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/066.md
[069]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/069.md
[070]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/070.md
[104]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/104.md
[121]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/121.md
[122]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/122.md
[136]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/136.md
[141]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/141.md
[142]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/142.md
[160]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/160.md
[206]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/206.md
[225]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/225.md
[232]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/232.md
[349]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/349.md
[687]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/687.md
[783]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/783.md
[938]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/938.md
[1038]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/1038.md
[1046]:https://github.com/BryceLee/algorithms-learning/blob/master/leetcode/1046.md
## 排序(sort)
- 涉及的概念
    - 有序度，是有序元素对的数量，有序元素对满足，如果i<j，则a[i]<=a[j]
    - 逆序度,是逆序对的数量，满足如果i<j,则a[i]>a[j]
    - 满有序度，其中满有序度=有序度+逆序度
- 一般会从这几个方面比较不同的排序算法
    - 最好，最坏，平均的时间复杂度情况
    - 时间复杂度系数，常数，低阶
    - 比较次数，交换次数
    - 稳定性：稳定与否等介于相同大小值的顺序是否会被再次更改。
- 各排序复杂度情况
![](https://static001.geekbang.org/wechat/images/28/28f8f7971b1f226775a563ddb63184ed.png)
- 冒泡排序 
[java implementation](https://github.com/BryceLee/algorithms-learning/blob/master/sort/bubbleSort.java)
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
- 插入排序 [java code]((https://github.com/BryceLee/algorithms-learning/blob/master/sort/insertSort.java)
    - 适用于少量元素的排序
    - 有点冒泡升级版本的意味，也涉及到比较和移动元素。交换次数也是逆序度。
    - 原理：分为两个区间，一个为排序区间，一个为未排序区间，初始状态下排序区间只有第一个元素，如果把第二个元素，也就是未排序区间的第一个元素，加入到排序区间中排序，然后继续拿未排序区间的第一个元素，加入排序区间去排序，直到完成排序。像扑克牌，抽牌插入手牌中排序。(注意，从算法实现上，从排序区间的尾部开始比较更佳，如果从首部开始，一次比较可能是n-1次移位，不是一个好方案，n是元素数量)
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
- 选择排序 [java code](https://github.com/BryceLee/algorithms-learning/blob/master/sort/SortSelection.java)
    - 原理：分为排序和未排序区间，每次都从未排序区间拿到最值，然后放到排序区间尾部（这个位置原来的数和最值位置交换，可能把与未排序区间数值大小相等的数字，放到更后面，所以不稳定）
    - 空间复杂度O（1）
    - 时间复杂度最坏最好平均都是O(n^2)
    - 稳定性：
        - 不稳定，他的原理决定了它的不稳定性。
- 归并排序 
    - 总是一分为二处理，处理好了再合并。分治思路+递归实现。
    - 是一个稳定的算法，可以参看伪代码
    - 时间复杂度是nlogn
    - 非原地排序算法（合并子数组，需要额外空间）
    - 空间复杂度是O(n)

  大体思路如下，具体可以看代码实现 [java code](https://github.com/BryceLee/algorithms-learning/blob/master/sort/mergesort.java)
``` java
mergesort(int[] array,int n){
//n=array.lenth
merge(array,0,n-1);
}

merge(int[] array,int start,int end){
  if(start>end){
    return;
  }
  int middle=(start+end)/2;
  merge(array,start,middle);
  merge(array,middle+1,end);
  mergeArray(array[start..end],array[start..middle],arrat[middle+1..end])
}

mergeArray(array[start..end],array[start..middle],arrat[middle+1..end]){
  int i=start,j=midlle+1,k=0;
  int[] temp=new int[]{end-start};
  while(i<=midlle&&j<=end){
    if(array[i]<=array[j]){
      temp[k++]=array[i++];
    }else{
      temp[k++]=array[j++];
    }
  }
  int tempStart,tempEnd;
  //Judging who do not finish task.
  if(i<=middle){
    tempStart=i;
    tempEnd=middle;
  }else{
    tempStart=j;
    tempEnd=end;
  }
  //do work remaining
  while(tempStart<=tempEnd){
    temp[k++]=array[tempStart];
  }
  //copy temp to array
  for(int index=0;index<array.length;i++){
    array[index]=temp[index];
  }
}
或者你可以借助哨兵模式来简化判断条件
```
- 快排
## 二分查找（Binary Search）
- 条件  
    - sorted（递增或递减）
    - 可以通过下标找到数据
- 时间复杂度O(log2（n）)（以2为底，n的对数）
## HEAP
- 堆必须是一个完全二叉树。完全二叉树要求，除了最后一层，其他层的节点个数都是满的，最后一层的节点都靠左排列。
- 堆中的每个节点的值必须大于等于（或者小于等于）其子树中每个节点的值
## Stack
## Queue
- PriorityQueue（默认是递增的队列，也就是小顶堆）,求最值(或者第几大元素)，求中位数等场景 （leetcode 703.）
  - 实现机制可以是HEAP
  - 也可以是 BinarySeachTree
```
Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        //System.out.println("o1=" + o1 + ",o2=" + o2);
        //o2 is in front of o1  
        //if (o1>o2){
          //return 1;//整数递增
        //}else {
          //return -1;//负数递减
        //}
        return o2 - o1;
        if（o2>o1）{
          return -1;
        }else{
          return 1;
        }
      }
    });
```
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
## [Tree](https://github.com/BryceLee/algorithms-learning/blob/master/data-structure/tree.md)
## Graph
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

