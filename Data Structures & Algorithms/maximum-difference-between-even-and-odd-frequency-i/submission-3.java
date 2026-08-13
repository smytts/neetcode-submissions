class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int a1 = 0;
        int a2 = Integer.MAX_VALUE;
        for (int count : freq) {
            if (count == 0) continue;
            if (count % 2 != 0) a1 = Math.max(a1, count);
            else a2 = Math.min(a2, count);
        }

        return a1 - a2;
    }
}