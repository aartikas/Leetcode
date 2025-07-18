class Solution {

    public int trap(int[] height) {
        int n = height.length-1;
        int[] leftmax = new int[n+1];
        int[] rightmax = new int[n+1];
        int tw = 0;

        leftmax[0] = height[0];
        rightmax[n] = height[n];

        for(int i = 1; i<=n; i++){
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        } 

        for(int i = n-1; i>=0 ;i--){
            rightmax[i]  = Math.max(rightmax[i+1],height[i]);
        }

        for(int i =0; i<=n; i++){
            tw += Math.min(leftmax[i],rightmax[i]) - height[i];
        }
        return tw;
        
    }
}