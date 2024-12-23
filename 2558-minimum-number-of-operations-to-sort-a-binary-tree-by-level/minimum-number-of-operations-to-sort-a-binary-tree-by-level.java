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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int total_Swap = 0;
        
        while(!queue.isEmpty()){
            int lvl_size = queue.size();
            int[] level_values = new int[lvl_size];

            for(int i = 0; i<lvl_size; i++ ){
                TreeNode node = queue.poll();
                level_values[i] = node.val;

                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            total_Swap+=minSwap(level_values);
        }
        return total_Swap;
        
    }

    private int minSwap(int []arr){
        int swap = 0;
        int [] target = arr.clone();
        Arrays.sort(target);

        Map<Integer, Integer> pos = new HashMap<>();
        for(int i = 0 ; i<arr.length;i++){
            pos.put(arr[i],i);
        }

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]!=target[i]){
                swap++;

                int currPos = pos.get(target[i]);
                pos.put(arr[i],currPos);
                arr[currPos] = arr[i];
            }
        }
        return swap;
    }
}