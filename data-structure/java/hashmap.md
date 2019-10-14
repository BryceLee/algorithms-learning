## HashMap

- HashMap实现了Map接口，Map提供了大量的可配置的操作，允许空key和空值，Hashmap几乎和Hashtable一样，除了前者允许空值和不是同步的。Haspmap无法保证Map的顺序，随着时间的推移顺序也可能会改变
- 是基于数组的扩张，利用了数组可以通过下标随机访问元素的特性，再通过hash（key）函数计算出来的hash值来决定元素存储的位置。如果hash碰撞就把新存储在链表中，链表长度到达8就把链表转成红黑树。
- 存储结构大致如图：
![](https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2752280655,620147884&fm=26&gp=0.jpg)
- 假设hash功能把数据元素适当的分散在存储空间里。这个实现给get,put操作提供了固定时间的性能。对集合的迭代，需要和Hashmap容量和键值对的大小成比例的时间。因此，如果要求比较高的迭代性能，初始容量和加载因子都不宜太大。
- Capacity
    - 存储空间数量
- Load factor
    - 扩容百分比阀值，默认是0.75（范围在0～1），
- 作为一般规则，默认加载因子（.75）在时间和空间成本之间提供了良好的折衷。较高的值会减少空间开销，但会增加查找成本（反映在HashMap类的大多数操作中，包括 get和put）。在设置其初始容量时，应考虑映射中的预期条目数及其负载因子，以便最小化重新散列操作的数量。如果初始容量大于最大条目数除以加载因子，则不会发生重新加载操作。
- 如果要将多个映射存储在HashMap 实例中，则使用足够大的容量创建映射将允许映射更有效地存储，而不是根据需要执行自动重新散列来扩展表。请注意，使用许多具有相同hashCode()作为键的数据是降低任何哈希表性能的可靠方法。为了改善影响，当键出现时Comparable，这个类可以使用键之间的比较顺序来帮助打破关系。
- 注意这个实现不同步，如果多线程同时访问hashmap，并且至少有一个线程修改了hashmap的结构（结构修改是添加或删除一个或多个映射的任何操作;仅更改与实例已包含的键相关联的值不是结构修改。））,必须从外部同步数据，
- 这通常通过同步自然封装映射的某个对象来完成.如果不存在此类对象，则应使用该Collections.synchronizedMap 方法“包装”Map,这最好在创建时完成,以防止意外地不同步访问Map.
```
 Map m = Collections.synchronizedMap（new HashMap（...））;
```
- 为什么负载因子是0.75?
    - 柏松分布有关
- 使用链表和红黑树来尽可能避免hash冲突
### 几个重要参数
- static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16 默认初始化容量
- static final int MAXIMUM_CAPACITY = 1 << 30;//容量必须是小于这个值的2的平方数
- static final int TREEIFY_THRESHOLD = 8;//链表转换成红黑树的链表（树）的阀值
- static final int UNTREEIFY_THRESHOLD = 6;
- static final int MIN_TREEIFY_CAPACITY = 64;


## Thanks:
- https://yikun.github.io/2015/04/01/Java-HashMap%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%E5%8F%8A%E5%AE%9E%E7%8E%B0/
- https://blog.csdn.net/visant/article/details/80045154