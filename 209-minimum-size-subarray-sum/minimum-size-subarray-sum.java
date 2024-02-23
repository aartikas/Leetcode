class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0, total = 0, size_sub = Integer.MAX_VALUE;

        for( r = 0; r<nums.length; r++){
            total += nums[r];
            while(total>=target){
                size_sub = Math.min(size_sub, r-l+1);
                total-=nums[l];
                l= l+1;
            }
        }

        if(size_sub!=Integer.MAX_VALUE){
            return size_sub;
        }else{
            return 0;
        }
        
    }
}