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
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> nestedList = new ArrayList<>();
        if (root == null) return nestedList;

        queue.offer(root);
        int currentLevel = 0;

        while (!queue.isEmpty()) {
            int length = queue.size();
            nestedList.add(new ArrayList<>());

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    nestedList.get(currentLevel).add(node.val);

                    if (node.left != null)
                        queue.offer(node.left);

                    if (node.right != null)
                        queue.offer(node.right);
                }
            }
            currentLevel++;
        }
        return nestedList;
    }
}
