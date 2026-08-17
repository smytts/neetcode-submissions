class Solution {
    public double averageWaitingTime(int[][] customers) {
        long timeToFinish = 0, total = 0;

        for (int[] customer: customers) {
            int arrival = customer[0], order = customer[1];
            timeToFinish = Math.max(timeToFinish, arrival) + order;
            total += timeToFinish - arrival;
        }

        return (double) total / customers.length;
    }
}