//fibonacci,time complexity O(n),space complexity O(1)
class Solution {
  public int climbStairs(int n) {
      if(n<=0){
        return 0;
      }
      if(n==1){
        return 1;
      }
      if(n==2){
        return 2;
      }
      int oneStepBefore=2;
      int twoStepBefore=1;
      int allways=0;
      for(int i=3;i<=n;i++){
        allways=oneStepBefore+twoStepBefore;
        twoStepBefore=oneStepBefore;
        oneStepBefore=allways;
      }
      return allways;
  }
}
//dp ，time complexity O(n),space complexity O（n)
//注意这里尽量别区考虑n=0的情况，如果把dp[0]=0会得到错误的结果
class Solution {
  public int climbStairs(int n) {
      if(n<=0){
        return 0;
      }
      if(n==1){
        return 1;
      }
      int[] dp=new int[n+1];//如果只申请n个长度的数组，dp[0]实际上指的是台阶1，这里方面理解申请n+1长度的数组
      dp[1]=1;
      dp[2]=2;
      for(int i=3;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
      }
      return dp[n];
  }
}
//recursion+memory ，time complexity O(n),space complexity O（n)
class Solution {
    public int climbStairs(int n) {
        if(n<=0){
          return 0;
        }
        int[] tem=new int[n];
        return climbStairs(0, n, tem);
    }
    public int climbStairs(int step, int n, int[] tem) {
    if (step > n) {
      return 0;
    }
    if (step == n) {
      return 1;
    }
    if (tem[step] > 0) {
      return tem[step];
    }
    tem[step] = climbStairs(step + 1, n, tem) + climbStairs(step + 2, n, tem);
    //System.out.println("step="+step);
    return tem[step];
  }
}

