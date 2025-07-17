class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length-1;
        k = k% (n+1);

        reverse(nums, 0 , n);
        reverse(nums, 0 , k-1);
        reverse(nums, k, n);
        
    }

    public void reverse(int[] num, int i , int j){
        while(i<j){
            int t  = num[i];
            num[i] = num[j];
            num[j] = t;
            i++;
            j--;
        }
    }
}