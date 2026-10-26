class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long m = (long) n * n;
        long expectedSum = m * (m + 1) / 2;
        long expectedSquares = m * (m + 1) * (2 * m + 1) / 6;
        
        long d = 0;
        long s = 0;
        long k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long val = grid[i][j];
                d += val - k;
                s += val * val - k * k;
                k++;
            }
        }
        long t = s / d;
        
        int a = (int) ((d + t) / 2);
        int b = (int) ((t - d) / 2);

        return new int[]{a, b};
    }
}