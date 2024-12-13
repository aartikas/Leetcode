class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        int [][] arr = new int[n][2];

        for(int i = 0; i<nums.length; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        //Sorting
        Arrays.sort(arr, (a,b)->{
            if(a[0]==b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        Set<Integer> set = new HashSet<>();
        long score = 0;

        for(int i = 0; i<n ; i++){
            int val = arr[i][0];
            int idx = arr[i][1];
            
            if(!set.contains(idx)) {
                score+=val;

                set.add(idx);
                set.add(idx+1);
                set.add(idx-1);
            }
        }

        return score;

        
    }
}