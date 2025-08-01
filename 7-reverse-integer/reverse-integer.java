class Solution {
    public int reverse(int x) {
        long sum = 0;
        while(x!=0){
            int d  = x%10;
            sum = sum*10 +d;
            x = x/10;
        }

        if(sum>Integer.MAX_VALUE || sum< Integer.MIN_VALUE)return 0;

        return (int)sum;
        
    }
}