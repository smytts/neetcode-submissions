class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (countMap.containsKey(nums[i])) countMap.put(nums[i], countMap.get(nums[i]) + 1);
            else countMap.put(nums[i], 1);
        }
        Map.Entry<Integer, Integer> maxEntry = Collections.max(countMap.entrySet(),
            Map.Entry.comparingByValue());

        return maxEntry.getKey();
    }
}