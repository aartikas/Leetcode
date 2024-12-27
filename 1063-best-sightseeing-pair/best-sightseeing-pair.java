class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int[] sfmax = new int[n];
        sfmax[n-1] = values[n-1] - (n-1);

        for(int i = n-2;i>=0;i--){
            sfmax[i] = Math.max(sfmax[i+1], values[i]-i);
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<n-1 ;i++){
            max  = Math.max(max, values[i]+i+sfmax[i+1]);
        }
        return max;
    }
}