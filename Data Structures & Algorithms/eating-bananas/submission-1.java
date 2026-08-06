class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int left = 1, right = Arrays.stream(piles).max().getAsInt(), result = right;
        
        while (left <= right) {
            int k = (left + right) / 2;
            double totalTime = 0;

            for (int pile : piles) {
                totalTime += Math.ceil((double) pile / k);
            }
            if (totalTime <= h) {
                result = k;
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return result;
    }
}
