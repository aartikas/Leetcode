class Solution {
    public int hIndex(int[] A) {
        Arrays.sort(A); //0,1,3,5,6
        //Dry run i = 0, n = 5, hindex = 0
        //1,1,3
        

        

        int n = A.length;
   
        for(int i =0 ;i<n ;i++){
            if(A[i] >= n-i){
               return n-i;
            }

        }

        return 0;

        
    }
}