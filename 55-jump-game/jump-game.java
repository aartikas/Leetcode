class Solution {
    public boolean canJump(int[] nums) {
        int jump_max = 0;

        for(int i = 0; i<nums.length ;i++){
            if(i>jump_max) return false;
            jump_max = Math.max(jump_max, i+nums[i]);
        }

        return true;
        
    }
}