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

    public int getMinimumDifference(TreeNode root) {
        int[] min = new int[]{Integer.MAX_VALUE};   // mutable container for min
        TreeNode[] prev = new TreeNode[1];          // mutable container for prev
        difference(root, prev, min);
        return min[0];
    }

    void difference(TreeNode root, TreeNode[] prev, int[] min) {
        if (root == null) return;

        difference(root.left, prev, min);

        if (prev[0] != null) {
            min[0] = Math.min(min[0], root.val - prev[0].val);
        }
        prev[0] = root;

        difference(root.right, prev, min);
    }
}
