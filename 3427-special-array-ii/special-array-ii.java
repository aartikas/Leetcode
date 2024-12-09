class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;

        int[] violations= new int[n-1];

        for(int i = 0 ; i<n-1; i++){
            if (nums[i] % 2 == nums[i + 1] % 2) {
                violations[i] = 1; // Same parity
            } else {
                violations[i] = 0; // Different parity
            }

        }

        int[] prefixSum = new int[n];
        for (int i = 0; i < n - 1; i++) {
            prefixSum[i + 1] = prefixSum[i] + violations[i];
        }

        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];

        // Check if there are any violations in the range
            ans[i] = (prefixSum[to] - prefixSum[from]) == 0;
        }

        return ans;
        
    }
}