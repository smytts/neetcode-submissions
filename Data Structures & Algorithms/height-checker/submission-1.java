class Solution {
    public int heightChecker(int[] heights) {
        int[] counts = new int[101];
        int count = 0;
        int h = 1; // height pointer

        for (int i = 0; i < heights.length; i++) {
            counts[heights[i]]++;
        }

        for (int i = 0; i < heights.length; i++) {
            while (counts[h] == 0) h++;
            if (h != heights[i]) count++;
            counts[h]--;
        }

        return count;
    }
}