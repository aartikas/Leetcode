class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count= 0;
         int n = baskets.length;
         for(int f: fruits){
            int u = 1;
            for(int i =0 ; i<n; i++){
                if(f<=baskets[i]){
                    baskets[i] = 0;
                    u =0 ;
                    break;
                    
                }
            }
            count+=u;
         }
        return count;
    }
}