class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost = 0;
        int totalgas = 0;

        for(int i =0 ; i<gas.length;i++){
            totalcost+=cost[i];
            totalgas +=gas[i];
        }
        int resultindex = 0;
        int total = 0;

        if(totalcost>totalgas) return -1;

        for(int i = 0; i<gas.length ; i++){
            total+=gas[i]  - cost[i];
            
            if(total<0){
                resultindex = i+1;
                total = 0;
            }

        }

        return resultindex;
        
    }
}