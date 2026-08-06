class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
            for (int num : nums) {
                numSet.add(num);
            }
            int longest = 0;

            for (int i : numSet) {
                if (!numSet.contains(i - 1)) {
                    int length = 1;
                    while (numSet.contains(i + length)) {
                        length++;
                    }
                    longest = Math.max(length, longest);
                }
            }
            return longest;
        
    }
}
