import java.awt.List;
import java.util.ArrayList;
// TODO 
public class T698 {
    public static void main(String[] args) {
        int[] a = new int[] { 4, 3, 2, 3, 5, 2, 1 };
       boolean is= canPartitionKSubsets(a, 4);
       System.out.println("is:"+is);
    }

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        // get aveger
        int av;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum%k!=0){
            return false;
        }
        av = sum / k;
        System.out.println("av:" + av);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > av) {
                return false;
            }
            if (nums[i] == av) {
                list.add(i);
                System.out.println("==");
            } else {
                for (int j = 0; j < nums.length; j++) {
                    if(list.contains(j)){
                        System.out.println("contain");
                        continue;
                    }else{
                        if(nums[j]<av&&nums[j]==av-nums[i]){
                            list.add(i);
                            System.out.println("add");
                            continue;
                        }
                    }
                }
            }
        }
        return list.size()==nums.length;
    }
}