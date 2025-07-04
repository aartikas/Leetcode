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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ll = new ArrayList<Integer>();
        helper(root,ll);
        return ll;
        
    }

    public void helper(TreeNode root, ArrayList<Integer>ll){
        if(root==null) return;
        helper(root.left,ll);
        helper(root.right,ll);
        ll.add(root.val);
    }
}