class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.stream(heights).sorted().toArray();
        
        int count = 0;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i]) count++;
        }

        return count;
    }
}