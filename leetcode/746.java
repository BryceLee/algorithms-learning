/**
 * 题意有点不好理解，leetcode讨论区一个很好的解释如下： 在首尾都加一个0 分别代表地面，和楼顶 数组的每一个数字代表从当前楼梯迈出所需要耗费的体力
 * 从地面开始，第一步可以选择第0阶或者第1阶，都不费力 最终要求到达最后一个0（楼顶）所耗费的体力最少。
 */
// DP 最重要的是要理解dp[i]=cost[i]+min(dp[i-1]，dp[i-2])-->从第i台阶出发需要的体力值方程
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }
        if (cost.length == 1) {
            return cost[0];
        }
        int allcost = 0;
        int oneStepBefore = cost[1];
        int twoStepBefore = cost[0];
        for (int i = 2; i < cost.length; i++) {
            allcost = cost[i] + Math.min(oneStepBefore, twoStepBefore);
            twoStepBefore=oneStepBefore;
            oneStepBefore=allcost;
        }
        return Math.min(twoStepBefore, oneStepBefore);//再计算倒数第一阶和倒数第二阶的更优解
    }

}
