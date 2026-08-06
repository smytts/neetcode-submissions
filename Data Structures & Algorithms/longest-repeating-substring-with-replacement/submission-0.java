class Solution {
    public int characterReplacement(String s, int k) {
        int[] array = new int[26];
        int res = 0, max = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            array[s.charAt(right) - 'A']++;
            max = Math.max(max, array[s.charAt(right) - 'A']);

            if ((right - left + 1) - max > k) {
                array[s.charAt(left) - 'A']--;
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
