class Solution {
    public int[] productExceptSelf(int[] nums) {
        int postfix = 1, prefix = 1; // Specify starting with 1 since we are looking for product
            int[] output = new int[nums.length];

            // For loop to get prefix
            for (int i = 0; i < nums.length; i++) {
                output[i] = prefix;
                prefix *= nums[i];
            }

            // For loop to get postfix
            for (int i = nums.length - 1; i >= 0; i--) {
                output[i] *= postfix;
                postfix *= nums[i];
            }
            return output;
    }
}  
