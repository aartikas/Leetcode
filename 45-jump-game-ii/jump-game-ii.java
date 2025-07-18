class Solution {
    public int jump(int[] nums) {
        int jump = 0, farthest = 0, currentend =0;

        //[2,3,1,1,4]
        //i = 0, fathest = 0+2=2,ce = 0, ce =2 jump=1
        //i=1 farthest = (2,4)ce=2,jump=1
        //i=2 farthest = (4, 3) ce=2,jump=2
        //i=3 farthest=(4,4) ce=4 jump=2
        //i=4 farthest(4,8)=8, ce=4

        for(int i = 0; i<nums.length-1; i++){
            farthest = Math.max(farthest, i+nums[i]);
            if(i==currentend){
                jump++;
                currentend = farthest;
            }
           
        }

        return jump;
        
    }
}