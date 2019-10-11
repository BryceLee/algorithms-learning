import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class T1046{
    public static void main(String[] args) {
        int[] arrary=new int[]{2,7,4,1,8,1};
        int last=lastStoneWeight(arrary);
        System.err.println("last:"+last);
        // Queue<Integer> q=new PriorityQueue<>(new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return o2-o1;
        //     }
        // });
        // q.offer(1);
        // q.offer(2);
        // System.out.println(q.poll());
        // System.out.println(q.poll());
    }

    public static int lastStoneWeight(int[] stones) {
        Queue<Integer> q=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<stones.length;i++){
            q.offer(stones[i]);
        }
        while(q.size()>1){
            int y=q.poll();
            int x=q.poll();
            if(x!=y){
                q.offer(y-x);
            }
        }
        if(q.size()==0){
            return 0;
        }
        return q.peek();
    }
}