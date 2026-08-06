class Solution {
    public int climbStairs(int n) {
        int oneStep = 1, twoStep = 1;
        for (int i = 0; i < n-1; i++) {
            int tmp = oneStep;
            oneStep = oneStep + twoStep;
            twoStep = tmp;
        }
        return oneStep;
    }
}
