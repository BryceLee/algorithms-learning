import javax.swing.tree.TreeNode;

public class insertSort {
  public static void main(String[] args) {
       smallToBig();
      // bigToSmall();
      //bigToSmallHead();
  }

  private static void smallToBig() {
      int[] array = new int[] { 4, 2, 3, 1, 7, 9 };
      int time = 0;
      int changetime = 0;
      int insert = 0;
      for (int i = 1; i < array.length; i++) {
          int j = i - 1;
          insert = array[i];
          System.out.println("待插入数据：" + insert);
          for (; j >= 0; --j) {
              time++;
              if (insert < array[j]) {
                  array[j + 1] = array[j];
                  changetime++;
                  System.out.println("交换数据：" + (j) + "位置上的" + array[j] + ",插入到" + (j + 1) + "位置上");
              } else {
                  // 找到需要插入的j
                  System.out.println("不交换数据：比较的数字是" + array[j] + "和" + insert);
                  break;
              }
          }
          // for循环中j--减去了1，所以加回来
          array[j + 1] = insert;
          System.out.println("插入数据" + insert + "到" + (j + 1) + "位置上");
      }
      for (int i = 0; i < array.length; i++) {
          System.out.println(array[i]);
      }
      System.out.println("time=" + time);
      System.out.println("changetime=" + changetime);
  }

  private static void bigToSmall() {
      int[] array = new int[] { 4, 2, 3, 1, 7, 9 };
      int time = 0;
      int changetime = 0;
      int insert = 0;
      for (int i = 1; i < array.length; i++) {
          int j = i - 1;
          insert = array[i];
          System.out.println("待插入数据：" + insert);
          for (; j >= 0; --j) {
              time++;
              if (insert < array[j]) {
                  array[j + 1] = array[j];
                  changetime++;
                  System.out.println("交换数据：" + (j) + "位置上的" + array[j] + ",插入到" + (j + 1) + "位置上");
              } else {
                  // 找到需要插入的j
                  System.out.println("不交换数据：比较的数字是" + array[j] + "和" + insert);
                  break;
              }
          }
          // for循环中j--减去了1，所以加回来
          array[j + 1] = insert;
          System.out.println("插入数据" + insert + "到" + (j + 1) + "位置上");
      }
      for (int i = 0; i < array.length; i++) {
          System.out.println(array[i]);
      }
      System.out.println("time=" + time);
      System.out.println("changetime=" + changetime);
  }

  // private static void bigToSmallHead() {
  //     // not good,is complicated algorithm
  //     // have not been done:
  //     int[] array = new int[] { 4, 2, 3, 1, 7, 9 };
  //     int time = 0;
  //     int changetime = 0;
  //     int insert = 0;
  //     for (int i = 1; i < array.length; i++) {
  //         insert = array[i];
  //         System.out.println("待插入数据：" + insert);
  //         int j=i-1;
  //         for (; j <= i; ++j) {
  //             time++;
  //             if (insert > array[j]) {
  //                 array[j + 1] = array[j];
  //                 changetime++;
  //                 System.out.println("交换数据：" + (j) + "位置上的" + array[j] + ",插入到" + (j + 1) + "位置上");
  //             } else {
  //                 // 找到需要插入的j
  //                 System.out.println("不交换数据：比较的数字是" + array[j] + "和" + insert);
  //                 break;
  //             }
  //         }
  //         System.out.println("准备插入数据,j=" + j);
  //         // for循环中j--减去了1，所以加回来
  //         array[j] = insert;
  //         System.out.println("插入数据" + insert + "到" + (j + 1) + "位置上");
  //     }
  //     for (int i = 0; i < array.length; i++) {
  //         System.out.println(array[i]);
  //     }
  //     System.out.println("time=" + time);
  //     System.out.println("changetime=" + changetime);
  // }
}

