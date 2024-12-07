class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int i = 0, j = 0;
        double curr_sum = 0, max_sum = 0;
        
        // Step 1 calculate the sum of first window
        while (j < k) {
            curr_sum += nums[j];
            j++;
        }

        max_sum = curr_sum;

        while( j< nums.length){
            curr_sum += nums[j] - nums[i];

            if(max_sum <= curr_sum){
                max_sum = curr_sum;
            }

            i++;
            j++;
        }

        return max_sum/k;
        
    }
}