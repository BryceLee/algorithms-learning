# Arraylist
```
如果我们执行
List<Object> list=new Arrlist<>();会发生什么？

先看一下构造方法：
    /**
     * Shared empty array instance used for default sized empty instances. We
     * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
     * first element is added.
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    /**
     * Constructs an empty list with an initial capacity of ten.
     这里其实还没有指定容量，不知道为什么这么写，实际上在add第一个元素的进行了初始化容量，后面将会说到。
     */
    public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
```
构造方法给elementData赋值了一个空数组。 

### 时间复杂度
- add操作，分为两种情况，看是否扩容，如果扩容，就是O(N),否则就是O(1)，只在最后添加
- 

### Thanks:
https://zhuanlan.zhihu.com/p/27873515