class Solution {
    public int waysToSplitArray(int[] nums) {
        int valid_split = 0;
        long total_sum = 0;
        for (int num : nums) {
            total_sum += num; // Calculate total sum of the array
        }
        
        long prefix_sum = 0;
        for (int i = 0; i < nums.length - 1; i++) { // Loop till n-2
            prefix_sum += nums[i]; // Update prefix sum
            long suffix_sum = total_sum - prefix_sum; // Calculate suffix sum
            if (prefix_sum >= suffix_sum) {
                valid_split++;
            }
        }
        return valid_split;
    }
}
