import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

//239 has been locked.
/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
// you can use
// this:https://www.nowcoder.com/practice/1624bc35a45c42c0bc17d17fa0cba788?tpId=13&tqId=11217&rp=4
// priority queue
public class leetcode239 {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 3, 4, 5 };
        ArrayList<Integer> list = maxInWindows(a, 3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // }
    // public class Solution {
    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList();
        if (size == 0 || num == null) {
            return list;
        }

        PriorityQueue queue = new PriorityQueue<>(size, new Comparator<Integer>() {
            public int compare(int o1, int o2) {
                return o2 - o1;
            }
        });
        for (i = 0; i < num.length; i++) {
            queue.add(num[i]);
            if (queue.size() == size) {
                list.add(new Integer(queue.peek()));
            }
        }
        return list;
    }
    // }
}