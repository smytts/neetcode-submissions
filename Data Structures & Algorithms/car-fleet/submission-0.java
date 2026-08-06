class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         int n = position.length;
        double[][] pairs = new double[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (a, b) -> Double.compare(b[0], a[0]));
        int result = 0;
        double[] timeToDestination = new double[n];
        for (int i = 0; i < n; i++) {
            timeToDestination[i] = (target - pairs[i][0]) / pairs[i][1];
            if (i >= 1 && timeToDestination[i] <= timeToDestination[i - 1]) {
                timeToDestination[i] = timeToDestination[i - 1];
            } else {
                result++;
            }
        }
        return result;
    }
}
