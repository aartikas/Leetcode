class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_cost = 0;
        int total_gas = 0;
        for(int i = 0; i<gas.length;i++){
            total_cost+=cost[i];
            total_gas+=gas[i];
        }
        if(total_gas<total_cost) return -1;
        int st = 0;
        int current_gas = 0;

        for(int i = 0; i<gas.length;i++){
            current_gas +=gas[i] - cost[i];
            if(current_gas<0){
                current_gas = 0;
                st = i+1;
            }

        }
        return st;
        
    }
}