class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int l = 0;
        int r = height.length-1;

        while(l < r){
            max_area = Math.max(max_area, (r-l)* Math.min(height[l],height[r]));

            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }

        return max_area;
        
    }
}