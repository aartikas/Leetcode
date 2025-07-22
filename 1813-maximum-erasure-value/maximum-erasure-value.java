class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        boolean [] seen  = new boolean[10001];
        int n = nums.length;
        int left = 0; 
        int cs = 0; 
        int ms = 0;

        for(int r = 0; r<n; r++){
            while(seen[nums[r]]){
                cs-=nums[left];
                seen[nums[left]] = false;
                left++;
            }
            cs+=nums[r];
            seen[nums[r]] = true;
            if(cs>ms){
                ms = cs;
            }
        } 
        return ms;
        
    }
}