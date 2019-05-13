# Array
- 数组定义：线性排列的表，只有前后方向，下标从0开始。用一组连续的内存空间来存储一组具有想同类型的数据。
- 特性：指定了数组的长度就不可更改。
- 其他线性结构的数据结构有链表，队列，栈等。
- 与线性表相对立的概念是非线性表，比如二叉树，堆，图等。：

#### 内存知识：计算机给每个内存分配一个地址，计算机通过地址来访问内存中的数据。
- 随机访问数组的某个元素时，通过下列公式计算存储该元素的内存地址：
```
创建数组，Java中：
dataType[] arrayRefVar = new dataType[arraySize];
int[] a=new int[5]{};
```
- 假如计算机给内存分配的连续地址是1-20：

a[i]的内存地址=1+i*datatypesize，（这里datatype是int,占用内存字节是4）
（//TODO 这里就认为是4吧，虽然int所占据的字节似乎和编译器有关）
#### 常用api:
以Java为例子
#### 插入
```
public static void main(String[] a) {
    int[] myarray = new int[10];
    String s = myarray.toString();
    System.out.println("array:" + s);
    System.out.println("array:hascode:" + System.identityHashCode(s));
    for (int i = 0; i < myarray.length; i++) {
      int v = myarray[i];
      System.out.println("arraym," + i + ":" + System.identityHashCode(v));
    }
  }

array:[I@6bc7c054
array:hascode:589431969
arraym,0:1252169911
arraym,1:1252169911
arraym,2:1252169911
arraym,3:1252169911
arraym,4:1252169911
arraym,5:1252169911
arraym,6:1252169911
arraym,7:1252169911
arraym,8:1252169911
arraym,9:1252169911
```
### Thanks:
- 极客时间《数据结构和算法之美》课程
- http://www.runoob.com/java/java-array.html
