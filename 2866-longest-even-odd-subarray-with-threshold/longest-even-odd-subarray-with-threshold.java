class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max_length = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i] %2 ==0 && nums[i]<=threshold){
                int j = i;
                int count = 1;
                while(j + 1 <nums.length && nums[j]%2!=nums[j+1]%2 && nums[j+1]<=threshold){
                    count++;
                    j++;
                    
                }
                if(count>max_length) max_length = count;

            }
        }
        return max_length;
        
    }
}