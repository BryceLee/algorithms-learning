class Solution {
    public int tribonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int all = 0;
        int oneBefore = 1;
        int twoBefore = 1;
        int threeBefore = 0;
        for (int i = 3; i <= n; i++) {
            all = oneBefore + twoBefore + threeBefore;
            threeBefore = twoBefore;
            twoBefore = oneBefore;
            oneBefore = all;
        }
        return all;
    }
}