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
    public TreeNode sortedArrayToBST(int[] nums) {

        TreeNode ans = recursion(nums, 0, nums.length-1);
        return ans;
        
    }

    public TreeNode recursion(int[] nums, int l, int r){
        if(l>r){
            return null;
        }

        int mid = l + (r-l)/2;
        
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = recursion(nums, l , mid-1);
        node.right = recursion(nums, mid+1, r);

        return node;
    }
}