class Solution {
    public int fib(int N) {
        if(N<=0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        int allways=0;
        int oneStepBefore=1;
        int twoStepBefore=0;
        for(int i=2;i<=N;i++){
            allways=oneStepBefore+twoStepBefore;
            twoStepBefore=oneStepBefore;
            oneStepBefore=allways;
        }
        return allways;
    }
}