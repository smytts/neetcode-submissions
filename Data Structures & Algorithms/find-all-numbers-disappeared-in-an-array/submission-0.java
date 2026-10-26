class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] > 0) {
                result.add(j + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return result;
    }
}