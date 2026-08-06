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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> nestedList = new ArrayList<>();
        dfs(root, 0, nestedList);
        return nestedList;
    }

     private void dfs(TreeNode node, int depth, List<List<Integer>> nestedList) {
        if (node == null) {
            return;
        }

        if (nestedList.size() == depth) {
            nestedList.add(new ArrayList<>());
        }

        nestedList.get(depth).add(node.val);
        dfs(node.left, depth +1, nestedList);
        dfs(node.right, depth +1, nestedList);
     }
}
