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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafVal1 = new ArrayList();
        List<Integer> leafVal2 = new ArrayList();

        helper(root1, leafVal1);
        helper(root2, leafVal2);

        return leafVal1.equals(leafVal2);

        
    }

    public void helper(TreeNode root,List<Integer> lf)
    {
        if(root==null)return;
        if(root.left==null && root.right==null) lf.add(root.val);

        helper(root.left,lf);
        helper(root.right,lf);
    }
}