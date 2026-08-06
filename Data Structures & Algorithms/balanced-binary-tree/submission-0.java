/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        
        return (dfs(root)[0] == 1);
    }

    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{1, 0}; // values in array represent true (1) or false (0) in the 0 index and the height in the 1 index
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        // check if first value in left and right equal true (1) and if the absolute value of the left and right are less than or equal to 1
        boolean balanced = left[0] == 1 && right[0] == 1 && Math.abs(left[1] - right[1]) <= 1; 
        int height = 1 + Math.max(left[1], right[1]);

        return new int[]{balanced ? 1 : 0, height};
    }
}
