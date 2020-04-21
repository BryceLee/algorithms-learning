class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        //定义函数f(n)，n下表的最好结果,f(n)=f(n-1)>0?f(n-1):0+nums[n];
        int sum=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            nums[i]=(nums[i-1]>0?nums[i-1]:0)+nums[i];
            sum=Math.max(sum,nums[i]);
        }
        return sum;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
    int max = nums[0];
    int tag = 0;
    for (int i = 0; i < nums.length; i++) {
      tag += nums[i];
      if (tag > max) {
        max = tag;
      }
    }
    return max;
    }
}