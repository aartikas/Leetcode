class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int N = nums.size();
        int min_sum = Integer.MAX_VALUE ;
        boolean flag = false;

        for(int start = 0 ; start<N; start++){
            int sum = 0;
            for(int end = start ; end<N; end++ ){
                sum+=nums.get(end);
                int length = end-start+1;
                if(length>=l && length<=r && sum>0){
                    min_sum= Math.min(min_sum,sum);
                    flag=true;
                }
            }
        }

        return flag ? min_sum: -1;

        
    }
}