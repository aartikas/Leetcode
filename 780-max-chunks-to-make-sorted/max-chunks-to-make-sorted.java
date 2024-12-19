class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
       
        int maxseen = 0;
        int partitions = 0;

        for(int i = 0 ; i< n ; i++){
            maxseen = Math.max(maxseen, arr[i]);
            if(i==maxseen) {
                partitions++;
            }
        }

        return partitions;

        
    }
}