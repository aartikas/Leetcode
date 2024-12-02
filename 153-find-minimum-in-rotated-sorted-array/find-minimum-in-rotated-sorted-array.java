class Solution {
    public int findMin(int[] nums) {
        int N = nums.length;
        int l = 0, r = N-1, mid= 0;
        while(l<r){
             mid = l + (r-l)/2;
            
            if(nums[mid]>nums[r]) {
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return nums[l];

        }
        
    }
