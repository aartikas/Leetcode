class Solution {
    public int lengthOfLIS(int[] nums) {
        int lis[] = new int[nums.length];

        for(int i = 0; i<nums.length;i++)lis[i]=1;

        for(int  i = nums.length-2; i>=0;i--){
            for(int j  = i+1; j <=nums.length-1; j++){
                if(nums[i]<nums[j]){
                    lis[i]= Math.max(lis[i],1+lis[j]);
                }
            }
        }
        Arrays.sort(lis);
        return(lis[nums.length-1]);
        
    }
}