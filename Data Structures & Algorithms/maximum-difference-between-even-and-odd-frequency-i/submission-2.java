class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char letter : s.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        int a1 = 0;
        int a2 = Integer.MAX_VALUE;
        for (int freq : map.values()) {
            if (freq % 2 != 0) a1 = Math.max(a1, freq);
            else a2 = Math.min(a2, freq);
        }

        return a1 - a2;
    }
}