class Solution {
    public int search(int[] nums, int target) {
          int left = 0, right = nums.length - 1;

        while (left <= right) {
            int x = left + ((right - left) / 2);
            if (nums[x] > target)
                right = x - 1;
            else if (nums[x] < target)
                left = x + 1;
            else return x;
        }
        return -1;
    }
}
