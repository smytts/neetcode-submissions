class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prev = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int n = nums[i];
                int diff = target - n;
                if (prev.containsKey(diff)) {
                    System.out.println(Arrays.toString(new int[]{prev.get(diff), i}));
                    return new int[]{prev.get(diff), i};
                }
                prev.put(n, i);
            }
            System.out.println(Arrays.toString(new int[]{}));
            return new int[]{};
    }
}
