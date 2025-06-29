class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int result = 0;
        int M = 1000000007;

        //Precompute powers
        int[] power = new int[n];
        power[0]=1;

        for(int i = 1; i<n;i++){
            power[i] = (power[i-1]*2)%M;
        }

        int l = 0,  r= n-1;

        while(l<=r){
            if(nums[l] + nums[r]<= target){

                result = (result +power[r-l])%M;
                l++;

            }else{
                r--;
            }
        }

        return result;

        
    }
}