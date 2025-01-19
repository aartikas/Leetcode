class Solution {
    public int longestSubarray(int[] nums) {
        int  i = 0; 
        int j = 0; 
        int last_seen_zero = -1;
        int result = 0;
        while(j <nums.length){

            if(nums[j]==0){
                i = last_seen_zero+1;
                last_seen_zero = j;
                
            }
            result= Math.max(result, j-i);
            j++;
        }

        return result;
        
    }
}