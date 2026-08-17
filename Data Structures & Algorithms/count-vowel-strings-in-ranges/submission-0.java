class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int[] ans = new int[queries.length];
        int[] prefixCount = new int[words.length + 1];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            prefixCount[i + 1] = prefixCount[i];
            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1)))
                prefixCount[i + 1]++;
        }

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            ans[i] = prefixCount[r + 1] - prefixCount[l];
        }

        return ans;
    }
}