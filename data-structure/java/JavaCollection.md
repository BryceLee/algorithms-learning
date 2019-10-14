# interfaces
- Collection
- Iterable
- Iterator
- ListIterator(仅服务于List类集合，类似List一般操作的迭代器)
# abstract Class
- AbstractCollection
    - make size() and iterator() abstract.

# Class
- ArrayList：支持动态添加删除查询的索引序列，缺点是如果是中间删除元素，代价大，删除位置后的所有元素都得向前移动一个位置。中间插入也得让插入为自己后的所有元素后移一个位置（位置不足，需要扩容）。（在添加删除元素较多场景下，用LinkedList替代）
- Vector：线程安全的ArrayList.
- LinkedList：支持在随机内存空间，高效率添加删除元素的序列。缺点查询效率低下，需要借助Iterator。
- ArrayDeque:由循环数组实现的双端队列
- HashSet：不重复，无序数组
- TreeSet：有序集合
- EnumSet
- LinkedHashSet：支持记住元素插入次序的集合
- PriorityQueue
- HashMap：存储键值对的集合
- TreeMap：键值有序排序的映射表
- LinkedHashMap：支持记住键值添加顺序的映射表
- WeakHashMap：支持值自动垃圾回收的映射表
- IdentityHashMap；用==而非equals来比较键值的映射表
